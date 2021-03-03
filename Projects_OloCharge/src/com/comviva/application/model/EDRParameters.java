package com.comviva.application.model;

public class EDRParameters
{
	private String appName = null;
	private String language = null;
	private long startTime = 0;
	private String msisdn = null;
	private String status = null;
	private String errorCode = null;
	private String responseMessage = null;
	private long endTime = 0;
	private long totalTimeTaken = 0;

	public String getAppName()
	{
		return appName;
	}

	public void setAppName(String appName)
	{
		this.appName = appName;
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public String getMsisdn()
	{
		return msisdn;
	}

	public void setMsisdn(String msisdn)
	{
		this.msisdn = msisdn;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	public String getResponseMessage()
	{
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage)
	{
		this.responseMessage = responseMessage;
	}

	public long getStartTime()
	{
		return startTime;
	}

	public void setStartTime(long startTime)
	{
		this.startTime = startTime;
	}

	public long getEndTime()
	{
		return endTime;
	}

	public void setEndTime(long endTime)
	{
		this.endTime = endTime;
	}

	public long getTotalTimeTaken()
	{
		return totalTimeTaken;
	}

	public void setTotalTimeTaken(long totalTimeTaken)
	{
		this.totalTimeTaken = totalTimeTaken;
	}

}
