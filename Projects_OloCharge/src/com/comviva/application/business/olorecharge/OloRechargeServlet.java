package com.comviva.application.business.olorecharge;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import prepay_pkg.ValidateCustomerPlan;

import com.comviva.application.constants.Constants;
import com.comviva.application.global.util.PrepareResponse;
import com.comviva.application.global.util.PropertyReader;
import com.comviva.application.global.util.SessionManager;
import com.comviva.application.global.util.Utils;
import com.comviva.application.model.AppRequest;
import com.comviva.application.model.AppResponse;
import com.comviva.application.model.EDRParameters;
import com.comviva.session.SessionObject;

public class OloRechargeServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger.getLogger(OloRechargeServlet.class);
	private static Logger EDR = Logger.getLogger(Constants.APP_ID_OLO_RECHARGE + Constants.EDR_LOGGER_SUFFIX);

	public void init(ServletConfig config) throws ServletException
	{
		try
		{
			super.init();
			LOGGER.info("Olo Recharge Servlet is Initiated");
		}
		catch (ServletException e)
		{
			LOGGER.error("Exception occured while initiating Sim Swap Servlet", e);
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException
	{

		AppRequest appRequest = new AppRequest();
		appRequest.setAppId(Constants.APP_ID_OLO_RECHARGE);
		OloRechargeProcessor oloRechargeProcessor = null;
		SessionObject session = null;
		try
		{
			AppResponse appResponse = new AppResponse();
			OloRechargeRequestParser oloRechargeRequestParser = new OloRechargeRequestParser();
			EDRParameters edrParameters = new EDRParameters();
			oloRechargeProcessor = new OloRechargeProcessor();
			appRequest = oloRechargeRequestParser.parseAppHttpRequest(request, appRequest);
			if (appRequest.isHttpRequestValid())
			{
				if (appRequest.getIsNewRequest().equals(Constants.ONE_STRING))
				{
					session = new SessionObject();
					if (LOGGER.isInfoEnabled())
					{
						LOGGER.info(" ######## New Request - Creating Session ########");
					}
					if (SessionManager.getSession(appRequest.getMsisdn()) != null)
					{
						SessionManager.removeSession(appRequest.getMsisdn());
						if (LOGGER.isDebugEnabled())
						{
							LOGGER.debug("New cache request came for existing session, removing the old cache for msisdn : "
									+ appRequest.getMsisdn());
						}
					}

					oloRechargeProcessor.executeValidateRequest(appRequest, appResponse);
					String responseMessage = appResponse.getResponseData();
					SessionManager.createSession(appRequest.getMsisdn(), session);
					session = SessionManager.getSession(appRequest.getMsisdn());
					appRequest.setQuestionaryState(Constants.MENU);
					session.setRequest(appRequest);
					response.setHeader(Constants.HEADER_FREEFLOWSTATE, Constants.FREEFLOW_CONTINUE);
					PrepareResponse.writeOutput(response, responseMessage);
					return;
				}

				if (appRequest.getIsNewRequest().equals(Constants.ZERO_STRING))
				{
					if (LOGGER.isInfoEnabled())
					{
						LOGGER.info(" ######## Existing Request ########");
					}
					session = SessionManager.getSession(appRequest.getMsisdn());
					AppRequest sessionAppRequest = null;
					if (session != null)
					{
						sessionAppRequest = (AppRequest) session.getRequest();
						if (sessionAppRequest.getQuestionaryState().equals(Constants.MENU))
						{
							if (LOGGER.isInfoEnabled())
							{
								LOGGER.info(" ######## Existing Request -- Menu State ########");
							}
							int numberOfPlans = sessionAppRequest.getNumberOfPlans();
							if (Integer.parseInt(appRequest.getSubscriberInput()) > 0
									&& Integer.parseInt(appRequest.getSubscriberInput()) <= numberOfPlans)
							{
								ValidateCustomerPlan[] validateCustomerPlans = sessionAppRequest
										.getValidateCustomerPlans();
								ValidateCustomerPlan validateCustomerPlan = validateCustomerPlans[Integer
										.parseInt(appRequest.getSubscriberInput()) - 1];
								
								String responseMessage = Utils.getMessageMenu(
										PropertyReader.getBundlesManagerOloRecharge(), appRequest.getLanguage(),
										Constants.MENU);
								
								responseMessage = responseMessage.replace(Constants.REPLACE_PLAN, validateCustomerPlan.getName());
								responseMessage = responseMessage.replace(Constants.REPLACE_CUSTOMER_ID, sessionAppRequest.getCustomerId());

								SessionManager.createSession(sessionAppRequest.getMsisdn(), session);
								session = SessionManager.getSession(sessionAppRequest.getMsisdn());
								sessionAppRequest.setPlanId(validateCustomerPlan.getId());
								sessionAppRequest.setQuestionaryState(Constants.CONFIRM);
								session.setRequest(sessionAppRequest);
								response.setHeader(Constants.HEADER_FREEFLOWSTATE, Constants.FREEFLOW_CONTINUE);
								PrepareResponse.writeOutput(response, responseMessage);
								return;
							}
							else
							{
								// send Invalid Option message
								appResponse.setRequestStatus(Constants.INVALID_OPTION_MESSAGE);
								response.setHeader(Constants.HEADER_FREEFLOWSTATE, Constants.FREEFLOW_BREAK);
								PrepareResponse.writeOutput(response, appResponse.getRequestStatus(),
										sessionAppRequest, appResponse, edrParameters, EDR);
								return;
							}
						}
						if (sessionAppRequest.getQuestionaryState().equals(Constants.CONFIRM))
						{
							if (LOGGER.isInfoEnabled())
							{
								LOGGER.info(" ######## Existing Request -- Confirm State ########");
							}
							if (appRequest.getSubscriberInput().equals(Constants.ONE_STRING))
							{
								if (LOGGER.isInfoEnabled())
								{
									LOGGER.info(" ######## Existing Request -- Setting Questionary here ########");
								}

								String responseMessage = Utils.getMessageMenu(
										PropertyReader.getBundlesManagerOloRecharge(), appRequest.getLanguage(),
										Constants.QUESTIONARY1);
								SessionManager.createSession(sessionAppRequest.getMsisdn(), session);
								session = SessionManager.getSession(sessionAppRequest.getMsisdn());
								sessionAppRequest.setQuestionaryState(Constants.QUESTIONARY1);
								session.setRequest(sessionAppRequest);
								response.setHeader(Constants.HEADER_FREEFLOWSTATE, Constants.FREEFLOW_CONTINUE);
								PrepareResponse.writeOutput(response, responseMessage);
								return;

							}
							if (appRequest.getSubscriberInput().equals(Constants.TWO_STRING))
							{
								// construct user aborted message
								appResponse.setRequestStatus(Constants.ABORT_MESSAGE);
								response.setHeader(Constants.HEADER_FREEFLOWSTATE, Constants.FREEFLOW_BREAK);
								PrepareResponse.writeOutput(response, appResponse.getRequestStatus(),
										sessionAppRequest, appResponse, edrParameters, EDR);
								return;
							}else{
								//construct user invalid message
							}
						}
						if (sessionAppRequest.getQuestionaryState().equals(Constants.QUESTIONARY1))
						{
							sessionAppRequest.setPin(appRequest.getSubscriberInput());
							oloRechargeProcessor.executePrepayRecharge(sessionAppRequest, appResponse);
							response.setHeader(Constants.HEADER_FREEFLOWSTATE, Constants.FREEFLOW_BREAK);
							PrepareResponse.writeOutput(response, appResponse.getResponseStatus(), sessionAppRequest,
									appResponse, edrParameters, EDR);
							return;
						}
					}
				}
			}
			else
			{
				appResponse.setRequestStatus(Constants.MANDATORY_PARAM_MESSAGE);
				response.setHeader(Constants.HEADER_FREEFLOWSTATE, Constants.FREEFLOW_BREAK);
				PrepareResponse.writeOutput(response, appResponse.getRequestStatus(), appRequest, appResponse,
						edrParameters, EDR);
				return;
			}
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}

	}

}
