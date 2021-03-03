package com.comviva.application.business.olorecharge;

import java.net.URL;
import java.util.Date;

import org.apache.log4j.Logger;

import prepay_pkg.PrepayBindingStub;
import prepay_pkg.PrepayLocator;
import prepay_pkg.PrepayRechargeRequest;
import prepay_pkg.PrepayRechargeResponse;
import prepay_pkg.Security;
import prepay_pkg.ValidateCustomerPlan;
import prepay_pkg.ValidateCustomerRequest;
import prepay_pkg.ValidateCustomerResponse;

import com.comviva.application.constants.Constants;
import com.comviva.application.global.util.ConfigurationsProps;
import com.comviva.application.model.AppRequest;
import com.comviva.application.model.AppResponse;

public class OloRechargeProcessor
{

	private static final Logger LOGGER = Logger.getLogger(OloRechargeProcessor.class);

	public void executeValidateRequest(AppRequest appRequest, AppResponse appResponse)
	{
		String responseMessage = Constants.EMPTY;

		if (LOGGER.isInfoEnabled())
		{
			LOGGER.info(appRequest.getLogId() + " In the request:@Olo Recharge Validate Request STATE");
		}

		PrepayLocator prepayLocator = null;
		PrepayBindingStub prepayBindingStub = null;
		try
		{
			prepayLocator = new PrepayLocator();
			appRequest.setTransStartTime(System.currentTimeMillis());
			/*prepayBindingStub = (PrepayBindingStub) prepayLocator.getprepayPort(new URL(ConfigurationsProps
					.getEndPointUrl()));*/
			
			prepayBindingStub = (PrepayBindingStub) prepayLocator.getprepayPort(new URL("http://localhost:8080/OloCharge/sucess.jsp"));
			prepayBindingStub.setTimeout(ConfigurationsProps.getConnectionTimeOut());

			ValidateCustomerRequest validateCustomerRequest = new ValidateCustomerRequest();

			Security security = new Security();
			security.setLogin(ConfigurationsProps.getUsername());
			security.setPassword(ConfigurationsProps.getPassword());

			validateCustomerRequest.setSecurity(security);
			validateCustomerRequest.setCustomerId(appRequest.getCustomerId());

			ValidateCustomerResponse validateCustomerResponse = prepayBindingStub
					.validateCustomer(validateCustomerRequest);

			int numberOfPlans = Integer.parseInt(validateCustomerResponse.getNum_plans());

			ValidateCustomerPlan[] validateCustomerPlansArray = validateCustomerResponse.getPlans();

			for (int i = 0; i < numberOfPlans; i++)
			{
				ValidateCustomerPlan validateCustomerPlan = (ValidateCustomerPlan) validateCustomerPlansArray[i];
				responseMessage += (i + 1) + ". " + validateCustomerPlan.getName() + Constants.NEW_LINE;
			}

			appRequest.setNumberOfPlans(numberOfPlans);
			appRequest.setValidateCustomerPlans(validateCustomerPlansArray);
			appResponse.setResponseData(responseMessage);

		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}

	}

	public void executePrepayRecharge(AppRequest appRequest, AppResponse appResponse)
	{
		if (LOGGER.isInfoEnabled())
		{
			LOGGER.info(appRequest.getLogId() + " In the request:@Olo Recharge Prepay Recharge STATE");
		}

		PrepayLocator prepayLocator = null;
		PrepayBindingStub prepayBindingStub = null;
		try
		{
			prepayLocator = new PrepayLocator();
			/*prepayBindingStub = (PrepayBindingStub) prepayLocator.getprepayPort(new URL(ConfigurationsProps
					.getEndPointUrl()));*/
			
			prepayBindingStub = (PrepayBindingStub) prepayLocator.getprepayPort(new URL("http://localhost:8080/OloCharge/sucess1.jsp"));
			prepayBindingStub.setTimeout(ConfigurationsProps.getConnectionTimeOut());

			PrepayRechargeRequest prepayRechargeRequest = new PrepayRechargeRequest();

			Security security = new Security();
			security.setLogin(ConfigurationsProps.getUsername());
			security.setPassword(ConfigurationsProps.getPassword());

			prepayRechargeRequest.setSecurity(security);
			prepayRechargeRequest.setCompanyCode(ConfigurationsProps.getCompanyCode());
			prepayRechargeRequest.setCustomerId(appRequest.getCustomerId());
			prepayRechargeRequest.setIdplan(appRequest.getPlanId());
			prepayRechargeRequest.setInserted(new Date().toString());
			prepayRechargeRequest.setMobiquityTransactionId(ConfigurationsProps.getMobTransId());

			PrepayRechargeResponse prepayRechargeResponse = (PrepayRechargeResponse) prepayBindingStub
					.prepayRecharge(prepayRechargeRequest);

			appResponse.setResponseStatus(prepayRechargeResponse.getStatus());
			
			appRequest.setTransEndTime(System.currentTimeMillis());
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}

	}

}
