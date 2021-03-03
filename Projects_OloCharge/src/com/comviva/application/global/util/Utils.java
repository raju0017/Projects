package com.comviva.application.global.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.comviva.application.constants.Constants;
import com.comviva.application.model.EDRParameters;
import com.comviva.util.ResourceBundlesManager;

public class Utils
{
	private static final Logger LOGGER = Logger.getLogger(Utils.class);
	private static String COUNTRYCODE = ConfigurationsProps.getCountryCode();
	private static int MSISDN_LENGTH = Integer.parseInt(ConfigurationsProps.getMsisdnLength());
	private static EDRWriter edrWriter;
	private static Logger EDR = Logger.getLogger("OLO_EDR");

	public static String getMessageFromResourceBundles(ResourceBundlesManager resourceBundlesManager, String language,
			String Keyword)
	{
		String message = null;
		try
		{
			message = resourceBundlesManager.getValueFromResourceBundle(language, Keyword);
		}
		catch (Exception e)
		{
			LOGGER.error("Error while getting the response message for the keywrod " + Keyword + "and Language "
					+ language);
		}
		return message;
	}

	public static String getMessageMenu(ResourceBundlesManager resourceBundlesManager, String language, String keyword)
	{
		if (LOGGER.isDebugEnabled())
		{
			LOGGER.debug("responseMessage : " + " language : " + language + " Keyword : " + keyword);
		}
		String respMsg = null;
		String responseMessage = null;
		if (resourceBundlesManager != null)
		{
			try
			{
				respMsg = resourceBundlesManager.getValueFromResourceBundle(language, keyword);

				responseMessage = respMsg;
			}
			catch (Exception e)
			{
				LOGGER.error("Error occurred while reading the response message", e);
				try
				{
					respMsg = resourceBundlesManager.getValueFromResourceBundle(language,
							Constants.DEFAULT_FAILURE_MESSAGE);
				}
				catch (Exception e1)
				{
					LOGGER.error("Default message is null");
				}
				responseMessage = respMsg;
			}
		}
		else
		{
			LOGGER.error("Resource Bundle Manager is null , Hence not sending any response");
		}

		LOGGER.debug("Response message:" + responseMessage);
		return responseMessage;

	}

	public static void writeEdr(EDRParameters edrParameters)
	{
		edrWriter.generalWriteEdr(edrParameters, EDR);
	}

	public static boolean isValidMsisdn(String msisdn)
	{
		if (msisdn == null || msisdn.trim().isEmpty())
		{
			LOGGER.error("Msisdn is null");
			return false;
		}
		if (!msisdn.startsWith(COUNTRYCODE))
		{
			LOGGER.error("Msisdn doesn't start with countrycode");
			return false;
		}
		else
		{
			String subMsisdn = msisdn.substring(getCountryCodeLength());
			if (LOGGER.isDebugEnabled())
			{
				LOGGER.debug("Sub Msisdn: " + subMsisdn);
			}
			if (subMsisdn.length() != MSISDN_LENGTH)
			{
				LOGGER.error("Sub Msisdn: " + subMsisdn + " length not " + MSISDN_LENGTH + " characters");
				return false;
			}
		}
		return true;
	}

	public static int getCountryCodeLength()
	{
		return COUNTRYCODE.length();
	}

	public static boolean isFlagEnabled(String value)
	{
		boolean flag = false;
		if ((value != null && value.trim().length() > 0)
				&& (value.equalsIgnoreCase(Constants.TRUE_VALUE1) || value.equalsIgnoreCase(Constants.TRUE_VALUE2) || value
						.equalsIgnoreCase(Constants.TRUE_VALUE3)))
		{
			flag = true;
		}
		return flag;
	}

	public static String getMessageFromResourceBundles(ResourceBundlesManager resourceBundlesManager, String language,
			String messageKey, String keyword)
	{
		if (LOGGER.isDebugEnabled())
		{
			LOGGER.debug("responseMessage : " + " language : " + language + " messageKey : " + messageKey
					+ " Keyword : " + keyword);
		}
		String respMsg = null;
		String responseMessage = null;
		if (resourceBundlesManager != null)
		{
			try
			{
				if (keyword == null)
				{
					respMsg = resourceBundlesManager.getValueFromResourceBundle(language, messageKey.trim());

				}
				else
				{
					respMsg = resourceBundlesManager.getValueFromResourceBundle(language, keyword
							+ Constants.UNDERSCORE + messageKey.trim());
				}
				responseMessage = respMsg;
			}
			catch (Exception e)
			{
				LOGGER.error("Error occurred while reading the response message", e);
				try
				{
					respMsg = resourceBundlesManager.getValueFromResourceBundle(language,
							Constants.DEFAULT_FAILURE_MESSAGE);
				}
				catch (Exception e1)
				{
					LOGGER.error("Default message is null");
				}
				responseMessage = respMsg;
			}
		}
		else
		{
			LOGGER.error("Resource Bundle Manager is null , Hence not sending any response");
		}

		LOGGER.debug("Response message:" + responseMessage);
		return responseMessage;

	}

	public static boolean nullcheck(String value)
	{
		if (value != null && !value.isEmpty() && value.length() != Constants.ZERO)
		{
			return true;
		}
		return false;

	}

	public static boolean parseToBoolean(String value)
	{
		LOGGER.debug("value for String to convert to Boolean : " + value);
		if (value.equalsIgnoreCase(Constants.TRUE_VALUE1) || value.equalsIgnoreCase(Constants.TRUE_VALUE2)
				|| value.equalsIgnoreCase(Constants.TRUE_VALUE3) || value.equalsIgnoreCase(Constants.TRUE_VALUE4))
		{
			return true;
		}
		return false;

	}

	public static String handleNull(String value)
	{
		if (value != null && !value.isEmpty() && value.length() != Constants.ZERO)
		{
			return value;
		}
		else
		{
			return String.valueOf(Constants.MINUS_ONE);
		}
	}

	public static String convertDatetoString(Date date, String dateFormat)
	{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(date);
	}
}
