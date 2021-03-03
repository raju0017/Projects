package com.comviva.application.global.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.comviva.application.constants.Constants;


public class TransactionIDGenerator
{

	private static final Logger LOGGER = Logger.getLogger(TransactionIDGenerator.class);

	private String transactionID;

	private static String appId;
	private static String nodeId = Constants.NODE_ID;
	private static int numberLimit = Constants.NUMBER_LIMIT ;
	private static int max_length = Constants.MAX_LENGTH;
	private static int number = 1;
	private static String prefix = Constants.PREFIX_DEFAULT;

	private static final Object lock = new Object();
	private String randomNumber;
	
	public String generateRandom()
	{
		Date date = new Date();
		DateFormat df = new SimpleDateFormat(Constants.DATE_FORMAT);
		String currentDate = df.format(date);
		LOGGER.trace("currentDate : " + currentDate);
		String uniqNumber = currentDate.replaceAll(Constants.COLON, "");
		LOGGER.trace("currentDate uniqNumber : " + uniqNumber);
		String nodeIdUniqNumber = nodeId + uniqNumber;
		LOGGER.trace("nodeIdUniqNumber : " + nodeIdUniqNumber);
		int uniqDigits = 1;
		synchronized (lock)
		{
			if (number > numberLimit)
			{
				number = 1;
			}
			uniqDigits = (++number);
		}
		LOGGER.trace("uniqDigits : " + uniqDigits);

		int length = prefix.length() + nodeIdUniqNumber.length() + String.valueOf(uniqDigits).length();
		int difference;

		difference = max_length - length;

		String diffString = Constants.EMPTY;
		for (int i = 0; i < difference; i++)
		{
			diffString = diffString + Constants.ZERO_STRING.intern();
		}

		LOGGER.trace("diffString : " + diffString);
		randomNumber = prefix + nodeIdUniqNumber + diffString + uniqDigits;
		if (LOGGER.isDebugEnabled())
		{
			LOGGER.debug("randomNumber : " + randomNumber);
		}
		LOGGER.trace("randomNumber length: " + randomNumber.length());

		return randomNumber;
	}

	@SuppressWarnings("unused")
	private static Properties readProperties(String fileName)
	{
		if (LOGGER.isDebugEnabled())
		{
			LOGGER.debug("Reading the Properties file " + fileName);
		}
		InputStream inputStream = getPropertiesStream(fileName);
		Properties properties = new Properties();
		try
		{
			properties.load((InputStream) inputStream);
		}
		catch (IOException e)
		{
			LOGGER.error("Error reading properties File " + fileName, e);
			return null;
		}
		finally
		{
			try
			{
				if (inputStream != null)
				{
					inputStream.close();
				}
			}
			catch (Exception ee)
			{
				LOGGER.error("Error : ", ee);
			}
		}
		return properties;
	}

	private static InputStream getPropertiesStream(String propertyFileName)
	{
		InputStream fileStream = null;
		try
		{
			if (LOGGER.isDebugEnabled())
			{
				LOGGER.debug("Read properties file " + propertyFileName);
			}
			fileStream = new FileInputStream(propertyFileName);
		}
		catch (FileNotFoundException e)
		{
			LOGGER.error("Properties file " + propertyFileName + " not found" + e.getMessage());
		}
		catch (Exception e)
		{
			LOGGER.error("Failed to read the configuration file:" + propertyFileName, e);
		}
		return fileStream;
	}

	public String getTransactionID()
	{
		return transactionID;
	}

	public static void setAppId(String appId)
	{
		TransactionIDGenerator.appId = appId;
	}

	public static void setAppName(String appName)
	{
		if (TransactionIDGenerator.appId != null)
		{
			TransactionIDGenerator.appId = appName;
		}
	}

}
