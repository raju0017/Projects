package com.comviva.application.global.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;

import com.comviva.application.constants.Constants;

public class CDREDRUtils
{

	private static final Logger LOGGER = Logger.getLogger(CDREDRUtils.class);

	@SuppressWarnings("unused")
	private static String getEncodedText(String input)
	{
		if (input == null || input.equalsIgnoreCase("-1"))
		{
			return "-1";
		}
		else
		{
			try
			{
			}
			catch (Exception e)
			{
				LOGGER.error("could not encode into base64, sending back input:" + input);
				return input;
			}
		}
		return input;
	}

	public static String getinDateTimeFormat(long timeInMilliSecs, String dateFormat)
	{
		if (timeInMilliSecs == 0)
		{
			return null;
		}
		Date date = new Date(timeInMilliSecs);
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		simpleDateFormat.setCalendar(calendar);
		calendar.setTime(date);
		return simpleDateFormat.format(date);
	}

	/**
	 * Null replace.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the string
	 */
	public static String nullReplace(Byte value)
	{
		return (value == null ? Constants.CDR_DEFAULT_VALUE : String.valueOf(value));
	}

	/**
	 * Null replace.
	 * 
	 * @param value
	 *            the value
	 * @param defaultvalue
	 * 
	 * @return the string
	 */
	public static String nullReplace(String value, String defaultvalue)
	{
		return (value == null ? defaultvalue : value.trim());
	}

	public static String nullReplace(List<String> valueList, String defaultvalue)
	{
		StringBuilder edrfileds = new StringBuilder(Constants.EMPTY);
		if (valueList == null || valueList.isEmpty())
		{
			return defaultvalue;
		}
		else
		{
			for (String value : valueList)
			{
				edrfileds.append(value).append(Constants.COLON);
			}
		}
		return edrfileds.toString();
	}

	/**
	 * Null replace.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the string
	 */
	public static String nullReplace(Long value, String defaultvalue)
	{
		return (value == Constants.ZERO ? defaultvalue : String.valueOf(value));
	}

	/**
	 * Null replace.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the string
	 */
	public static String nullReplace(Integer value, String defaultvalue)
	{
		return (value == Constants.ZERO ? defaultvalue : String.valueOf(value));
	}

	/**
	 * Null replace.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the string
	 */
	public static String nullReplace(Double value, String defaultvalue)
	{
		return (value == Constants.ZERO ? defaultvalue : String.valueOf(value));
	}

	public String getformatteddata(long timeStamp, String defaultvalue)
	{
		Date date = new Date(timeStamp);
		SimpleDateFormat sdf = new SimpleDateFormat(defaultvalue);
		return sdf.format(date);
	}
	
}
