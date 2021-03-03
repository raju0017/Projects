package com.comviva.application.global.util;

import org.apache.log4j.Logger;

import com.comviva.application.constants.Constants;

public class ConfigurationsProps
{

	static final Logger LOGGER = Logger.getLogger(ConfigurationsProps.class);
	private static Object lockObject = new Object();
	private static IniUtils applicationIni = PropertyReader.getApplicationIni();

	private static String edrDateFormat;
	private static String edr_delimiter;
	private static String edr_end = Constants.EMPTY;
	private static String edr_default;
	private static String edr_extTrx_default;
	private static String edr_extTrx_delimiter;
	private static boolean edr_pin_req = false;
	private static String blankEdrEntryPeriod = "60000";// 1 minute

	private static long sessionTimeOut = 60000L;
	private static String countryCode;
	private static String msisdnLength;
	private static String countryCodeReq;
	private static String removeZero;

	private static String username;
	private static String password;
	private static String endPointUrl;
	private static int connectionTimeOut;

	private static String companyCode;
	private static String mobTransId;

	static
	{
		try
		{
			String configValue = null;

			configValue = applicationIni.get(Constants.REFNUM, Constants.SESSION_TIME_OUT);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("SESSION_TIME_OUT configured is: " + configValue);
				}
				sessionTimeOut = Long.parseLong(configValue);

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading sessionTimeOut : " + sessionTimeOut);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.COUNTRYCODE);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("CountryCode configured is: " + configValue);
				}
				countryCode = configValue;

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading countryCode : " + countryCode);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.COUNTRYCODE_REQ);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("COUNTRYCODE_REQ configured is: " + configValue);
				}
				countryCodeReq = configValue;

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading COUNTRYCODE_REQ : " + countryCodeReq);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.USERNAME);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("USERNAME configured is: " + configValue);
				}
				username = configValue;

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading USERNAME : " + username);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.PASSWORD);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("PASSWORD configured is: " + configValue);
				}
				password = configValue;

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading PASSWORD : " + password);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.END_POINT_URL);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("END_POINT_URL configured is: " + configValue);
				}
				endPointUrl = configValue;

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading END_POINT_URL : " + endPointUrl);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.CONNECTION_TIME_OUT);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("CONNECTION_TIME_OUT configured is: " + configValue);
				}
				connectionTimeOut = Integer.parseInt(configValue);

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading CONNECTION_TIME_OUT : " + connectionTimeOut);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.REMOVE_ZERO);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("REMOVE_ZERO configured is: " + configValue);
				}
				removeZero = configValue;

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading REMOVE_ZERO : " + removeZero);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.COMPANY_CODE);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("COMPANY_CODE configured is: " + configValue);
				}
				companyCode = configValue;

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading COMPANY_CODE : " + companyCode);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.MOBIQUITY_TRANSACTION_ID);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("MOBIQUITY_TRANSACTION_ID configured is: " + configValue);
				}
				mobTransId = configValue;

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading MOBIQUITY_TRANSACTION_ID : " + mobTransId);
				}
			}

			configValue = applicationIni.get(Constants.REFNUM, Constants.MSISDN_LENGTH);
			if (configValue != null && configValue.isEmpty() == false)
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("msisdnLength configured is: " + configValue);
				}
				msisdnLength = configValue;

			}
			else
			{
				if (LOGGER.isDebugEnabled())
				{
					LOGGER.debug("Error Loading msisdnLength : " + msisdnLength);
				}
			}

			// **************************************************************EDR***********************************************************************
			String blankEdrEntryPeriodString = applicationIni.get(Constants.EDR_SECTION_NAME,
					Constants.BLANK_EDR_ENTRY_PERIOD);
			if (blankEdrEntryPeriodString != null)
			{
				blankEdrEntryPeriod = blankEdrEntryPeriod.trim();
			}
			LOGGER.info("Blank entry period configured : " + blankEdrEntryPeriod);

			String edr_pin_reqValue = applicationIni.get(Constants.EDR_SECTION_NAME, Constants.EDR_PIN_REQ);
			if (edr_pin_reqValue == null || edr_pin_reqValue.trim().isEmpty() == true)
			{
				edr_pin_req = false;
			}
			else
			{
				edr_pin_req = Utils.parseToBoolean(edr_pin_reqValue.trim());
			}
			LOGGER.info("edr_pin_req configured : " + edr_pin_req);

			edrDateFormat = applicationIni.get(Constants.EDR_SECTION_NAME, Constants.EDR_DATE_FORMAT);
			if (edrDateFormat != null)
			{
				edrDateFormat = edrDateFormat.trim();
			}
			LOGGER.info("edrDateFormat configured : " + edrDateFormat);

			edr_delimiter = applicationIni.get(Constants.EDR_SECTION_NAME, Constants.EDR_DELIMITER);
			if (edr_delimiter != null)
			{
				edr_delimiter = edr_delimiter.trim();
			}
			LOGGER.info("edr_delimiter configured : " + edr_delimiter);

			edr_default = applicationIni.get(Constants.EDR_SECTION_NAME, Constants.EDR_DEFAULT_VALUE);
			if (edr_default != null)
			{
				edr_default = edr_default.trim();
			}
			LOGGER.info("edr_default configured : " + edr_default);

			edr_end = applicationIni.get(Constants.EDR_SECTION_NAME, Constants.EDR_END);
			if (edr_end != null)
			{
				edr_end = edr_end.trim();
			}
			LOGGER.info("edr_end configured :  " + edr_end);

			edr_extTrx_delimiter = applicationIni.get(Constants.EDR_SECTION_NAME, Constants.EDR_EXTERNALTNX_DELIMITER);
			if (edr_extTrx_delimiter != null)
			{
				edr_extTrx_delimiter = edr_extTrx_delimiter.trim();
			}
			LOGGER.info("edr_extTrx_delimiter configured : " + edr_extTrx_delimiter);

			edr_extTrx_default = applicationIni
					.get(Constants.EDR_SECTION_NAME, Constants.EDR_EXTERNALTNX_DEFAULT_VALUE);
			if (edr_extTrx_default != null)
			{
				edr_extTrx_default = edr_extTrx_default.trim();
			}
			LOGGER.info("edr_extTrx_default configured : " + edr_extTrx_default);

		}
		catch (Exception exception)
		{

		}
	}

	public static String getEdrDateFormat()
	{
		return edrDateFormat;
	}

	public static void setEdrDateFormat(String edrDateFormat)
	{
		ConfigurationsProps.edrDateFormat = edrDateFormat;
	}

	public static String getEdr_delimiter()
	{
		return edr_delimiter;
	}

	public static void setEdr_delimiter(String edr_delimiter)
	{
		ConfigurationsProps.edr_delimiter = edr_delimiter;
	}

	public static String getEdr_end()
	{
		return edr_end;
	}

	public static void setEdr_end(String edr_end)
	{
		ConfigurationsProps.edr_end = edr_end;
	}

	public static String getEdr_default()
	{
		return edr_default;
	}

	public static void setEdr_default(String edr_default)
	{
		ConfigurationsProps.edr_default = edr_default;
	}

	public static String getEdr_extTrx_default()
	{
		return edr_extTrx_default;
	}

	public static void setEdr_extTrx_default(String edr_extTrx_default)
	{
		ConfigurationsProps.edr_extTrx_default = edr_extTrx_default;
	}

	public static String getEdr_extTrx_delimiter()
	{
		return edr_extTrx_delimiter;
	}

	public static void setEdr_extTrx_delimiter(String edr_extTrx_delimiter)
	{
		ConfigurationsProps.edr_extTrx_delimiter = edr_extTrx_delimiter;
	}

	public static boolean isEdr_pin_req()
	{
		return edr_pin_req;
	}

	public static void setEdr_pin_req(boolean edr_pin_req)
	{
		ConfigurationsProps.edr_pin_req = edr_pin_req;
	}

	public static String getBlankEdrEntryPeriod()
	{
		return blankEdrEntryPeriod;
	}

	public static long getSessionTimeOut()
	{
		return sessionTimeOut;
	}

	public static String getCountryCode()
	{
		return countryCode;
	}

	public static String getMsisdnLength()
	{
		return msisdnLength;
	}

	public static void setBlankEdrEntryPeriod(String blankEdrEntryPeriod)
	{
		ConfigurationsProps.blankEdrEntryPeriod = blankEdrEntryPeriod;
	}

	public static String getCountryCodeReq()
	{
		return countryCodeReq;
	}

	public static String getRemoveZero()
	{
		return removeZero;
	}

	public static String getUsername()
	{
		return username;
	}

	public static String getPassword()
	{
		return password;
	}

	public static String getEndPointUrl()
	{
		return endPointUrl;
	}

	public static int getConnectionTimeOut()
	{
		return connectionTimeOut;
	}

	public static String getCompanyCode()
	{
		return companyCode;
	}

	public static String getMobTransId()
	{
		return mobTransId;
	}

	public static String removeCountryCode(String msisdn)
	{
		String strMsisdn = "";
		strMsisdn = msisdn.substring(3);
		return strMsisdn;
	}

	public static void updateParamsAsConfigFileChanged()
	{
		LOGGER.debug("updating Params as Confgiuration file has changed : ");
		synchronized (lockObject)
		{

			try
			{
				applicationIni = PropertyReader.getApplicationIni();
			}

			catch (Exception e)
			{
				LOGGER.error(e.getMessage(), e);
			}

		}
	}
}
