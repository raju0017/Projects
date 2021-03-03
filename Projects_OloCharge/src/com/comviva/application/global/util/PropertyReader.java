package com.comviva.application.global.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.comviva.application.constants.Constants;
import com.comviva.util.ResourceBundlesManager;

public class PropertyReader
{
	public static final int REFRESH_INTERVAL = 5000;

	private static final String RESOURCE_BUNDLE_OLO_RECHARGE = Constants.RESOURCE_BUNDLE_OLO_RECHARGE;

	private static ResourceBundlesManager bundlesManagerOloRecharge;

	private static final Logger LOGGER = Logger.getLogger(PropertyReader.class);
	private static final String LOG4J_FILE = Constants.LOG4J_PROPERTIES;
	private static final String APPLICATION_INI = Constants.APPLICATION_INI;

	private static IniUtils applicationIni;

	static
	{
		applicationIni = readApplicationIni();
		bundlesManagerOloRecharge = readBundleManager(RESOURCE_BUNDLE_OLO_RECHARGE);
	}

	private static ResourceBundlesManager readBundleManager(String resourceBundle)
	{
		ResourceBundlesManager bundlesManager;
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(getConfFilePath(resourceBundle));
		bundlesManager = new ResourceBundlesManager(stringBuffer.toString());
		return bundlesManager;
	}

	public static Properties readProperties(String propertyFileName)
	{

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(getConfPath());
		stringBuffer.append(propertyFileName);
		FileInputStream propertyFileStream = null;
		try
		{
			propertyFileStream = new FileInputStream(stringBuffer.toString());
			LOGGER.info("Read properties file " + stringBuffer.toString());
		}
		catch (FileNotFoundException e)
		{
			LOGGER.error("Properties file " + propertyFileName + " not found", e);
			return null;
		}

		Properties properties = new Properties();
		try
		{
			properties.load(propertyFileStream);
		}
		catch (IOException e)
		{
			LOGGER.error("Error reading properties File " + propertyFileName, e);
			try
			{
				propertyFileStream.close();
			}
			catch (Exception ee)
			{
			}
			return null;
		}
		finally
		{
			try
			{
				propertyFileStream.close();
			}
			catch (Exception ee)
			{
			}
		}

		return properties;
	}

	public static void initializelog4j()
	{
		StringBuffer logFile = new StringBuffer(getConfPath());
		logFile.append(Constants.GLOBAL).append(File.separator);
		logFile.append(LOG4J_FILE);
		org.apache.log4j.PropertyConfigurator.configureAndWatch(logFile.toString(), 5000);

		if (LOGGER.isInfoEnabled())
		{
			LOGGER.info("log4j file path : " + logFile);
		}

	}

	private static IniUtils readApplicationIni()
	{
		LOGGER.debug("reading application ini : ");
		IniUtils ini = null;
		if (ini == null)
		{
			try
			{
				ini = new AutoRefreshingIniUtils(getConfFilePath(APPLICATION_INI))
						.addListener(new IniFileChangeAdapter()
						{
							@Override
							public void notifyFileChanged(IniUtils ini)
							{
								if (LOGGER.isInfoEnabled())
									LOGGER.info(APPLICATION_INI + " file got updated. Updating Application.ini");
								ConfigurationsProps.updateParamsAsConfigFileChanged();
							}

						});
			}
			catch (IOException e)
			{
				LOGGER.error("Could not apply Auto Refresh for ini File:" + getConfFilePath(APPLICATION_INI), e);
				FileInputStream fis = loadFileFromFileSystem(getConfFilePath(APPLICATION_INI));
				ini = readIniFile(fis, getConfFilePath(APPLICATION_INI));
			}
		}
		return ini;
	}

	@SuppressWarnings("unused")
	private static IniUtils readIni(String IniFileName)
	{

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(getConfPath());
		stringBuffer.append(Constants.GLOBAL).append(File.separator).append(IniFileName);
		IniUtils ini = null;
		if (ini == null)
		{
			ini = new IniUtils();
			try
			{
				ini.load(stringBuffer.toString());
				LOGGER.debug("initilaised the Ini file : " + IniFileName);
			}
			catch (IOException e)
			{
				LOGGER.error("Error occurred while loading the Ini file " + IniFileName, e);
			}

		}

		return ini;

	}

	private static IniUtils readIniFile(InputStream iniFileStream, String fileName)
	{
		IniUtils iniUtils = new IniUtils();
		try
		{
			if (LOGGER.isInfoEnabled())
			{
				LOGGER.info("Reading ini file " + fileName);
			}
			iniUtils.load((InputStream) iniFileStream);
		}
		catch (IOException e)
		{
			LOGGER.error("Error while reading ini File " + fileName, e);
			return null;
		}
		finally
		{
			try
			{
				if (iniFileStream != null)
				{
					iniFileStream.close();
				}
			}
			catch (Exception ee)
			{
				LOGGER.error("Error : ", ee);
			}
		}
		return iniUtils;
	}

	public static FileInputStream loadFileFromFileSystem(String fileName)
	{
		FileInputStream propertyFileStream = null;
		try
		{
			propertyFileStream = new FileInputStream(fileName);
		}
		catch (FileNotFoundException e)
		{
			LOGGER.error("File " + fileName + " not found", e);
		}
		return propertyFileStream;
	}

	public static String getConfPath()
	{
		String installPath = System.getProperty(Constants.INSTALL_PATH);
		if (installPath == null || installPath.trim().equals(Constants.EMPTY))
		{
			installPath = Constants.BAR;
		}

		installPath = installPath.trim();

		installPath = installPath + File.separator + Constants.CONF + File.separator;
		if (LOGGER.isInfoEnabled())
		{
			LOGGER.info("Application Configurations Path : " + installPath);
		}

		return installPath;
	}

	public static String getConfFilePath(String fileName)
	{

		StringBuffer buffer = new StringBuffer(getConfPath());
		buffer.append(Constants.GLOBAL).append(File.separator).append(fileName);
		System.out.println("buffer : " + buffer);
		return buffer.toString();
	}

	public static ResourceBundlesManager getBundlesManagerOloRecharge()
	{
		return bundlesManagerOloRecharge;
	}

	public static void setBundlesManagerOloRecharge(ResourceBundlesManager bundlesManagerOloRecharge)
	{
		PropertyReader.bundlesManagerOloRecharge = bundlesManagerOloRecharge;
	}

	public static IniUtils getApplicationIni()
	{
		return applicationIni;
	}

}
