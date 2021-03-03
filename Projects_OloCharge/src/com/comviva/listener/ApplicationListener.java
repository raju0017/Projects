package com.comviva.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.comviva.application.global.util.PropertyReader;

/**
 * 
 * @author prithwish.samanta
 * @created May 7, 2015
 */
public class ApplicationListener implements ServletContextListener
{	
	private static final Logger LOGGER = Logger.getLogger(ApplicationListener.class);

	@Override
	public void contextDestroyed(ServletContextEvent arg0)
	{
		LOGGER.fatal("Application Stopped!...");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0)
	{
		LOGGER.fatal("Application Started!...");
		LOGGER.fatal("Initializing Log4j");
		PropertyReader.initializelog4j();
	}

}