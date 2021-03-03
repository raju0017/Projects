package com.comviva.application.global.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.comviva.application.model.EDRParameters;
import com.comviva.session.SessionObject;

public class SessionManager
{
	private static final Logger LOGGER = Logger.getLogger(SessionManager.class);
	public static ConcurrentHashMap<String, SessionObject> sessionsMap = new ConcurrentHashMap<String, SessionObject>();
	private static long delayInterval = 5000L;
	private static long maxSessionDuration = ConfigurationsProps.getSessionTimeOut();

	static
	{
		System.out.println("SessionManager class is loading.....");
		Timer timer = new Timer();
		timer.schedule(new CleanerTask(), new Date(), delayInterval);
	}

	static class CleanerTask extends TimerTask
	{

		@Override
		public void run()
		{
			List<String> expiredMsisdnList = new ArrayList<String>();
			Set<String> msisdnSet = null;
			synchronized (sessionsMap)
			{
				msisdnSet = sessionsMap.keySet();
				if (msisdnSet != null && !msisdnSet.isEmpty())
				{
					for (String msisdn : msisdnSet)
					{
						SessionObject request = sessionsMap.get(msisdn);
						long currentTime = System.currentTimeMillis();
						if ((currentTime - request.getStoredTime()) > maxSessionDuration)
						{
							expiredMsisdnList.add(msisdn);
						}
					}
				}
			}
			if (expiredMsisdnList != null && expiredMsisdnList.isEmpty() == false)
			{
				for (String msisdn : expiredMsisdnList)
				{
					SessionObject currentReq = null;
					synchronized (sessionsMap)
					{
						currentReq = removeSession(msisdn);
					}
					if (currentReq != null)
					{
						if (LOGGER.isInfoEnabled())
						{
							LOGGER.info("Response timeout happened for the subscriber : " + msisdn);
						}
						Object obj = currentReq.getRequest();
						if (obj instanceof SessionParams)
						{
							SessionParams sessionParams = (SessionParams) currentReq.getRequest();
							LOGGER.debug("Session Cleaned for MSISDN and proceeding to Write EDR: " + msisdn + " : "
									+ sessionParams.getMsisdn());
							EDRParameters edr = sessionParams.getEdr();
							long startTime = currentReq.getStoredTime();
							edr.setMsisdn(currentReq.getMsisdn());
							// edr.setSeparator("|");SSSSSS
							LOGGER.trace("set the resultCode to  600 as the subscriber has not responded within the time");

							long endDate = System.currentTimeMillis();
							LOGGER.debug("end time : " + endDate + " startTime : " + startTime);
							String difference = String.valueOf(TimeUnit.MILLISECONDS.toMillis(endDate - startTime));

							LOGGER.debug("total time taken for the transaction : " + difference);
							try
							{
								EDRWriter edrWriter = new EDRWriter();
								// edrWriter.setEdrParams(appRequest,
								// appResponse, edr);
								edrWriter.generalWriteEdr(edr, LOGGER);
							}
							catch (Exception e)
							{

								LOGGER.error("error while writing edr", e);
							}
						}
						if (LOGGER.isInfoEnabled())
						{
							LOGGER.info("Done with all the things in cleaner task thread, hence releasing the lock");
						}
					}
					else
					{
						break;
					}
				}
			}
			else
			{
				if (LOGGER.isInfoEnabled())
				{
					//LOGGER.info("No sessions available to clean ");
				}
			}
		}
	}

	public static void createSession(String msisdn, SessionObject request)
	{
		LOGGER.debug("Creating session for :" + msisdn);
		LOGGER.error("creating session for:" + msisdn + ", sessionsMap.size :" + sessionsMap.size());
		synchronized (sessionsMap)
		{
			sessionsMap.put(msisdn, request);
		}
	}

	public static SessionObject getSession(String msisdn)
	{
		LOGGER.debug("get session for :" + msisdn);
		synchronized (sessionsMap)
		{
			System.out.println("The map size is ::" + sessionsMap.size());
			Set<String> msisdns = sessionsMap.keySet();
			System.out.println("The size of set is ::" + msisdns.size());
			Iterator<String> msisdnIterator = msisdns.iterator();
			while (msisdnIterator.hasNext())
			{
				System.out.println("The saved msisdns in the session are :" + msisdnIterator.next());
			}
			return sessionsMap.get(msisdn);
		}
	}

	public static SessionObject removeSession(String msisdn)
	{
		LOGGER.debug("remove session for :" + msisdn);
		LOGGER.error("removing session for:" + msisdn + ", sessionsMap.size :" + sessionsMap.size());
		synchronized (sessionsMap)
		{
			return sessionsMap.remove(msisdn);
		}
	}
}