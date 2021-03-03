package com.comviva.application.global.util;

import com.comviva.application.model.EDRParameters;

public class SessionParams
{
	private String msisdn;
	private String language;
	private String transactionTime;
	private String appStartTime;
	private String responseCode;
	private String edrResponseCode;
	private String freeflowState;
	private String offerCode;
	private String abilityRefNum;
	private String serviceType;
	private String extUser;
	private String extApp;
	private String extRef;
	private String reasonCode;
	private String sessionState;
	private String prevSubscriberInput;
	private EDRParameters edr;

	public String getMsisdn()
	{
		return msisdn;
	}

	public void setMsisdn(String msisdn)
	{
		this.msisdn = msisdn;
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public String getTransactionTime()
	{
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime)
	{
		this.transactionTime = transactionTime;
	}

	public String getAppStartTime()
	{
		return appStartTime;
	}

	public void setAppStartTime(String appStartTime)
	{
		this.appStartTime = appStartTime;
	}

	public String getResponseCode()
	{
		return responseCode;
	}

	public void setResponseCode(String responseCode)
	{
		this.responseCode = responseCode;
	}

	public String getOfferCode()
	{
		return offerCode;
	}

	public void setOfferCode(String offerCode)
	{
		this.offerCode = offerCode;
	}

	public String getEdrResponseCode()
	{
		return edrResponseCode;
	}

	public void setEdrResponseCode(String edrResponseCode)
	{
		this.edrResponseCode = edrResponseCode;
	}

	public String getFreeflowState()
	{
		return freeflowState;
	}

	public void setFreeflowState(String freeflowState)
	{
		this.freeflowState = freeflowState;
	}

	public String getAbilityRefNum()
	{
		return abilityRefNum;
	}

	public void setAbilityRefNum(String abilityRefNum)
	{
		this.abilityRefNum = abilityRefNum;
	}

	public String getServiceType()
	{
		return serviceType;
	}

	public void setServiceType(String serviceType)
	{
		this.serviceType = serviceType;
	}

	public String getExtUser()
	{
		return extUser;
	}

	public void setExtUser(String extUser)
	{
		this.extUser = extUser;
	}

	public String getExtApp()
	{
		return extApp;
	}

	public void setExtApp(String extApp)
	{
		this.extApp = extApp;
	}

	public String getExtRef()
	{
		return extRef;
	}

	public void setExtRef(String extRef)
	{
		this.extRef = extRef;
	}

	public String getReasonCode()
	{
		return reasonCode;
	}

	public void setReasonCode(String reasonCode)
	{
		this.reasonCode = reasonCode;
	}

	public String getSessionState()
	{
		return sessionState;
	}

	public void setSessionState(String sessionState)
	{
		this.sessionState = sessionState;
	}

	public String getPrevSubscriberInput()
	{
		return prevSubscriberInput;
	}

	public void setPrevSubscriberInput(String prevSubscriberInput)
	{
		this.prevSubscriberInput = prevSubscriberInput;
	}

	public EDRParameters getEdr()
	{
		return edr;
	}

	public void setEdr(EDRParameters edr)
	{
		this.edr = edr;
	}

}
