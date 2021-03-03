package com.vscs.atyourhome.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vscs.atyourhome.bean.*;

@Component("SrValidation")
public class SrValidation implements Validator{
	
	@SuppressWarnings("unused")
	private static final String ep_date=null;
	
	public boolean supports(@SuppressWarnings("rawtypes") Class clazz)
	{
		return ServiceRequestBean.class.isAssignableFrom(clazz);
	}

	public void validate(Object model, Errors errors)
	{
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sub_serv_name","required.sub_serv_name", "Sub Service Name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ep_date","required.ep_date", "Service Expecting Date is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone","required.phone", "Phone Number is required.");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "QUESTION","required.QUESTION", "can not be blank.");
		
		/*ValidationUtils.rejectIfEmpty(errors, "START_DATE","required.SURVEY_NAME", "Enter date");*/
	}

}
