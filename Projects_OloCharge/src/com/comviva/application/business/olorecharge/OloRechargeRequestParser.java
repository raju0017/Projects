package com.comviva.application.business.olorecharge;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.comviva.application.constants.Constants;
import com.comviva.application.global.util.CommonUtils;
import com.comviva.application.global.util.ConfigurationsProps;
import com.comviva.application.global.util.TransactionIDGenerator;
import com.comviva.application.global.util.Utils;
import com.comviva.application.model.AppRequest;

public class OloRechargeRequestParser
{

	private static final Logger LOGGER = Logger.getLogger(OloRechargeRequestParser.class);
	
	public AppRequest parseAppHttpRequest(HttpServletRequest request, AppRequest appRequest)
	{
		if (LOGGER.isDebugEnabled())
		{
			LOGGER.debug("@parseHttpRequest,Parsing Olo Recharge httpRequest ,Request State:OLO_RECHARGE_REQUEST_PARSE");
		}
		boolean status = parseHttpRequest(request, appRequest);
		LOGGER.debug("status : " + status);		
		appRequest.setHttpRequestValid(status);
		return appRequest;
	}
	
	public boolean parseHttpRequest(HttpServletRequest request, AppRequest appRequest)
	{
		appRequest.setTransStartTime(System.currentTimeMillis());
		Map<String, String> map = CommonUtils.getParametersMap(request);
		LOGGER.info("MAP: " + map);
		if (map != null && map.isEmpty() == false)
		{
			if (Utils.nullcheck(map.get(Constants.INPUT_LANGUAGE)))
			{
				appRequest.setLanguage(map.get(Constants.INPUT_LANGUAGE).trim());
			}
			else
			{
				appRequest.setLanguage(Constants.DEFAULT_LANGUAGE);
				LOGGER.error("Error while reading the language as value not set in request : ");
			}

			if (Utils.nullcheck(map.get(Constants.INPUT_CUSTOMER_ID)))
			{
				appRequest.setCustomerId(map.get(Constants.INPUT_CUSTOMER_ID).trim());
			}
			
			if (Utils.nullcheck(map.get(Constants.IS_NEW_REQUEST)))
			{
				appRequest.setIsNewRequest(map.get(Constants.IS_NEW_REQUEST).trim());
			}
			
			if (Utils.nullcheck(map.get(Constants.IS_REQUEST)))
			{
				appRequest.setIsRequest(map.get(Constants.IS_REQUEST).trim());
			}
			
			if (Utils.nullcheck(map.get(Constants.SUBSCRIBER_INPUT)))
			{
				appRequest.setSubscriberInput(map.get(Constants.SUBSCRIBER_INPUT).trim());
			}			
			
			if (Utils.nullcheck(map.get(Constants.INPUT_PIN)))
			{
				appRequest.setPin(map.get(Constants.INPUT_PIN).trim());
			}

			if (Utils.nullcheck(map.get(Constants.INPUT_MSISDN)))
			{
				String number = map.get(Constants.INPUT_MSISDN).trim();

				if (number.startsWith(ConfigurationsProps.getCountryCode()))
				{
					if (ConfigurationsProps.getCountryCodeReq().equals(Constants.YES))
					{
						appRequest.setMsisdn(number.trim());
					}
					else if (ConfigurationsProps.getCountryCodeReq().equals(Constants.NO))
					{
						appRequest.setMsisdn(ConfigurationsProps.removeCountryCode(number.trim()));
					}
				}
				else
				{
					if (ConfigurationsProps.getRemoveZero().equals(Constants.YES))
					{
						if (number.startsWith(Constants.ZERO_STRING))
						{
							appRequest.setMsisdn(number.substring(1));
						}
					}
					else
					{
						appRequest.setMsisdn(number.trim());
					}
				}
			}else{
				return false;
			}

			if (Utils.nullcheck(map.get(Constants.INPUT_COMMON_TRANSACTION_ID)))
			{
				appRequest.setCommonTransactionId(map.get(Constants.INPUT_COMMON_TRANSACTION_ID).trim());
			}
			else
			{
				TransactionIDGenerator transactionIDGenerator = new TransactionIDGenerator();
				appRequest.setCommonTransactionId(transactionIDGenerator.generateRandom());
			}
			String logId = Constants.LOGID_FORMAT;
			logId = logId.replace(Constants.APP_NAME, appRequest.getAppId());
			logId = logId.replace(Constants.MSISDN, appRequest.getMsisdn());
			logId = logId.replace(Constants.COMMON_TRANSACTION_ID, appRequest.getCommonTransactionId());
			appRequest.setLogId(logId);

		}
		return true;
	}

}
