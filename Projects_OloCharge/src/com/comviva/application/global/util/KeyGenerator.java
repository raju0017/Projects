package com.comviva.application.global.util;

import org.apache.log4j.Logger;

/**
 * 
 * @author prithwish.samanta
 * @created May 7, 2015
 */
public class KeyGenerator
{
	private static final Logger LOGGER = Logger.getLogger(KeyGenerator.class);
	private static final Object lock = new Object();
	private static final Object gatewayInfoLock = new Object();
	private static long counter = 100001L;
	private static String instanceId = "20";
	private static long gatewayInfoCounter = 0L;

	public static Long getRegistrationId()
	{
		synchronized (lock)
		{
			if (counter > 10000)
			{
				counter = 0L;
			}
			StringBuffer sb = new StringBuffer();
			sb.append(instanceId).append(System.currentTimeMillis()).append(counter++);
			long Id = 0L;
			try
			{
				Id = Long.parseLong(sb.toString());
				LOGGER.info("UserRegistrationId: " + Id);
			}
			catch (Exception e)
			{
				LOGGER.error("Error occurred while generating Registration Id: ", e);
			}
			return Id;
		}
	}

	public static Long getGatewayId()
	{
		synchronized (gatewayInfoLock)
		{
			if (gatewayInfoCounter > 10000)
			{
				gatewayInfoCounter = 0L;
			}
			StringBuffer sb = new StringBuffer();
			sb.append(instanceId).append(System.currentTimeMillis()).append(gatewayInfoCounter++);
			long Id = 0L;
			try
			{
				Id = Long.parseLong(sb.toString());
				LOGGER.info("Gateway Id:" + Id);
			}
			catch (Exception e)
			{
				LOGGER.error("Error occurred while generating Gateway Id", e);
			}
			return Id;
		}
	}
}
