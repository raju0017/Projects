package com.comviva.application.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prepay_pkg.ValidateCustomerPlan;

import com.comviva.application.constants.Constants;

public class AppRequest
{
	private String appId = null;
	private String appName;
	private long transStartTime = 0;
	private long transEndTime = 0;
	private String commonTransactionId;
	private String logId = Constants.EMPTY;
	private HttpServletRequest httpRequest = null;
	private HttpServletResponse httpResponse = null;
	private String msisdn;
	private String language;
	private boolean isHttpRequestValid;
	private String isNewRequest;
	private String questionaryState;
	private String questionary;
	private String subscriberInput;
	private String isRequest;
	private String customerId;
	private String pin;
	private ValidateCustomerPlan[] validateCustomerPlans;
	private int numberOfPlans;
	private String planId;
	
	public String getPlanId()
	{
		return planId;
	}

	public void setPlanId(String planId)
	{
		this.planId = planId;
	}

	public String getQuestionary()
	{
		return questionary;
	}

	public void setQuestionary(String questionary)
	{
		this.questionary = questionary;
	}

	public int getNumberOfPlans()
	{
		return numberOfPlans;
	}

	public void setNumberOfPlans(int numberOfPlans)
	{
		this.numberOfPlans = numberOfPlans;
	}

	public ValidateCustomerPlan[] getValidateCustomerPlans()
	{
		return validateCustomerPlans;
	}

	public void setValidateCustomerPlans(ValidateCustomerPlan[] validateCustomerPlans)
	{
		this.validateCustomerPlans = validateCustomerPlans;
	}

	public String getPin()
	{
		return pin;
	}

	public void setPin(String pin)
	{
		this.pin = pin;
	}

	public String getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	public String getQuestionaryState()
	{
		return questionaryState;
	}

	public void setQuestionaryState(String questionaryState)
	{
		this.questionaryState = questionaryState;
	}

	public String getSubscriberInput()
	{
		return subscriberInput;
	}

	public void setSubscriberInput(String subscriberInput)
	{
		this.subscriberInput = subscriberInput;
	}

	public String getIsRequest()
	{
		return isRequest;
	}

	public void setIsRequest(String isRequest)
	{
		this.isRequest = isRequest;
	}

	public String getIsNewRequest()
	{
		return isNewRequest;
	}

	public void setIsNewRequest(String isNewRequest)
	{
		this.isNewRequest = isNewRequest;
	}

	public boolean isHttpRequestValid()
	{
		return isHttpRequestValid;
	}

	public void setHttpRequestValid(boolean isHttpRequestValid)
	{
		this.isHttpRequestValid = isHttpRequestValid;
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

	public String getAppId()
	{
		return appId;
	}

	public void setAppId(String appId)
	{
		this.appId = appId;
	}

	public String getAppName()
	{
		return appName;
	}

	public void setAppName(String appName)
	{
		this.appName = appName;
	}

	public long getTransStartTime()
	{
		return transStartTime;
	}

	public void setTransStartTime(long transStartTime)
	{
		this.transStartTime = transStartTime;
	}

	public long getTransEndTime()
	{
		return transEndTime;
	}

	public void setTransEndTime(long transEndTime)
	{
		this.transEndTime = transEndTime;
	}

	public String getCommonTransactionId()
	{
		return commonTransactionId;
	}

	public void setCommonTransactionId(String commonTransactionId)
	{
		this.commonTransactionId = commonTransactionId;
	}

	public String getLogId()
	{
		return logId;
	}

	public void setLogId(String logId)
	{
		this.logId = logId;
	}

	public HttpServletRequest getHttpRequest()
	{
		return httpRequest;
	}

	public void setHttpRequest(HttpServletRequest httpRequest)
	{
		this.httpRequest = httpRequest;
	}

	public HttpServletResponse getHttpResponse()
	{
		return httpResponse;
	}

	public void setHttpResponse(HttpServletResponse httpResponse)
	{
		this.httpResponse = httpResponse;
	}

}