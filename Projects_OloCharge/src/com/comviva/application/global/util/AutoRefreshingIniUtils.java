package com.comviva.application.global.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

public class AutoRefreshingIniUtils extends IniUtils
{
	private static final Logger LOGGER = Logger.getLogger(AutoRefreshingIniUtils.class);
	private long LAST_LOADED = System.currentTimeMillis();
	private CopyOnWriteArrayList<IniFileChangeAdapter> listeners = new CopyOnWriteArrayList<IniFileChangeAdapter>();

	public AutoRefreshingIniUtils(String absolutePathToPriopertiesFile) throws IOException
	{
		LOGGER.debug("@AutoRefreshingIniUtils : " + absolutePathToPriopertiesFile);
		load(absolutePathToPriopertiesFile);
	}

	public AutoRefreshingIniUtils removeListener(IniFileChangeAdapter listener)
	{
		listeners.remove(listener);
		return this;
	}

	public AutoRefreshingIniUtils addListener(IniFileChangeAdapter listener)
	{
		LOGGER.debug("@addListener : ");
		listeners.add(listener);
		return this;
	}

	public synchronized void load(String absoluteFilePath) throws IOException
	{
		LOGGER.debug("@load : " + absoluteFilePath);
		File f = new File(absoluteFilePath);
		InputStream is = new FileInputStream(f);
		this.load(is);
		LAST_LOADED = f.lastModified();
		keepUpdated(absoluteFilePath);
	}

	private void keepUpdated(final String absoluteFilePath)
	{
		LOGGER.debug("@keepUpdated : " + absoluteFilePath);
		Executors.newSingleThreadExecutor().submit(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					while (true)
					{
						File f = new File(absoluteFilePath);
						long fll = f.lastModified();
						if (fll > LAST_LOADED)
						{
							if (LOGGER.isInfoEnabled())
							{
								LOGGER.info("Change found in file," + f.getName() + ", last modified time :" + fll
										+ ", LastLoadedTime:" + LAST_LOADED + ", difference:" + (fll - LAST_LOADED)
										+ ", Reloading File:[" + absoluteFilePath + "]");
							}
							InputStream is = new FileInputStream(f);
							load(is);
							LAST_LOADED = fll;
							notifyListeners();
						}
						Thread.yield();
						Thread.sleep(PropertyReader.REFRESH_INTERVAL);
					}
				}
				catch (Exception e)
				{
					LOGGER.error(e.getMessage(), e);
				}
			}
		});
	}

	private void notifyListeners()
	{
		final IniUtils properties = new IniUtils();
		for (IniFileChangeAdapter aListener : listeners)
		{
			aListener.notifyFileChanged(properties);
		}
	}
}