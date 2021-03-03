package com.comviva.application.global.util;

import org.apache.log4j.Logger;

import com.comviva.application.model.AppRequest;
import com.comviva.application.model.AppResponse;
import com.comviva.application.model.EDRParameters;

public class EDRWriter
{
	private static final Logger LOGGER = Logger.getLogger(EDRWriter.class);

	private static String edr_delimiter = ConfigurationsProps.getEdr_delimiter();
	private static String edr_end = ConfigurationsProps.getEdr_end();
	private static String edr_dateFormat = ConfigurationsProps.getEdrDateFormat();
	private static String edr_default = ConfigurationsProps.getEdr_default();

	public void generalWriteEdr(EDRParameters edr, Logger EDR)
	{
		LOGGER.info("Inside write EDR");
		LOGGER.info("edr.getmethod : " + edr.getAppName() + " | " + edr.getStatus());

		StringBuilder appEDR = new StringBuilder();

		appEDR.append(CDREDRUtils.nullReplace(edr.getAppName(), edr_default)).append(edr_delimiter);
		appEDR.append(CDREDRUtils.nullReplace(edr.getLanguage(), edr_default)).append(edr_delimiter);
		appEDR.append(getinEDRDateFormat(edr.getStartTime(), edr_default)).append(edr_delimiter);
		appEDR.append(CDREDRUtils.nullReplace(edr.getMsisdn(), edr_default)).append(edr_delimiter);
		appEDR.append(CDREDRUtils.nullReplace(edr.getStatus(), edr_default)).append(edr_delimiter);
		appEDR.append(CDREDRUtils.nullReplace(edr.getErrorCode(), edr_default)).append(edr_delimiter);
		appEDR.append(CDREDRUtils.nullReplace(edr.getResponseMessage(), edr_default)).append(edr_delimiter);
		appEDR.append(getinEDRDateFormat(edr.getEndTime(), edr_default)).append(edr_delimiter);
		appEDR.append(CDREDRUtils.nullReplace(edr.getTotalTimeTaken(), edr_default)).append(edr_delimiter);
		appEDR.append(edr_end);
		LOGGER.debug(edr.getAppName() + " EDR : " + appEDR.toString());
		EDR.info(appEDR.toString());
		
	}

	/**
	 * Setting Edr Params
	 * 
	 * @param appRequest
	 * @param appResponse
	 * @param edrParameters
	 */
	public void setEdrParams(AppRequest appRequest, AppResponse appResponse, EDRParameters edrParameters)
	{
		/**
		 * set end time
		 */
		appRequest.setTransEndTime(System.currentTimeMillis());
		edrParameters.setErrorCode(appResponse.getResponseCode());
		edrParameters.setStatus(appResponse.getResponseStatus());
		edrParameters.setResponseMessage(appResponse.getResponseDescription());
		edrParameters.setStartTime(appRequest.getTransStartTime());
		edrParameters.setEndTime(appRequest.getTransEndTime());
		edrParameters.setLanguage(appRequest.getLanguage());
		edrParameters.setAppName(appRequest.getAppId());
		edrParameters.setMsisdn(appRequest.getMsisdn());
		edrParameters.setTotalTimeTaken(appRequest.getTransEndTime() - appRequest.getTransStartTime());
		
	}

	private String getinEDRDateFormat(long timeData, String defaulvalue)
	{
		// TODO Auto-generated method stub
		if (timeData != 0)
		{
			return CDREDRUtils.getinDateTimeFormat(timeData, edr_dateFormat);
		}
		else
		{
			return CDREDRUtils.nullReplace(timeData, edr_dateFormat);
		}
	}

}
