package com.comviva.application.global.util;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.comviva.application.constants.Constants;
import com.comviva.application.global.util.EDRWriter;
import com.comviva.application.global.util.PropertyReader;
import com.comviva.application.model.AppRequest;
import com.comviva.application.model.AppResponse;
import com.comviva.application.model.EDRParameters;
import com.comviva.util.ResourceBundlesManager;

public class PrepareResponse
{
	private static final Logger LOGGER = Logger.getLogger(PrepareResponse.class);
	private static ResourceBundlesManager bundlesManager = PropertyReader.getBundlesManagerOloRecharge();

	public static void writeOutput(HttpServletResponse response, String responseMessage) throws IOException
	{
		ServletOutputStream printWriter = null;
		try
		{
			response.setContentType(Constants.UTF_CODE);

			printWriter = response.getOutputStream();

			printWriter.write(responseMessage.getBytes(Constants.UTF_CODE));

		}
		catch (Exception e)
		{

			LOGGER.error(" Failed to send response ", e);
		}
		finally
		{
			printWriter.flush();
			printWriter.close();
		}
	}

	public static void writeOutput(HttpServletResponse response, String requestStatus, AppRequest appRequest,
			AppResponse appResponse, EDRParameters edrParameters, Logger EDR) throws Exception
	{		
		ServletOutputStream printWriter = null;
		String responseMessage = "";
		try
		{
			response.setContentType(Constants.UTF_CODE);
			if (LOGGER.isInfoEnabled())
			{
				LOGGER.info("Freeflow break");
			}
			response.setHeader(Constants.HEADER_FREEFLOWSTATE, Constants.FREEFLOW_BREAK);

			printWriter = response.getOutputStream();

			if (requestStatus == null || requestStatus.trim().equals(Constants.EMPTY))
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Response String is null");
				}

				responseMessage = bundlesManager.getValueFromResourceBundle(appRequest.getLanguage(),
						Constants.EMPTY_RESPONSE);
			}
			else
			{
				responseMessage = bundlesManager.getValueFromResourceBundle(appRequest.getLanguage(),
						requestStatus);
			}
			System.out.println(responseMessage);
			EDRWriter edrWriter = new EDRWriter();
			appResponse.setResponseDescription(responseMessage);
			edrWriter.setEdrParams(appRequest, appResponse, edrParameters);
			edrWriter.generalWriteEdr(edrParameters, EDR);
			
			printWriter.write(responseMessage.getBytes(Constants.UTF_CODE));

		}
		catch (Exception e)
		{
			e.printStackTrace();
			LOGGER.error(appRequest.getLogId() + " Failed to send response ");
			responseMessage = bundlesManager.getValueFromResourceBundle(appRequest.getLanguage(),
					Constants.DEFAULT_MESSAGE);
			printWriter.write(responseMessage.getBytes(Constants.UTF_CODE));
		}
		finally
		{
			printWriter.flush();
			printWriter.close();
		}
	}

}
