package com.vscs.atyourhome.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.vscs.atyourhome.model.UserRegister;

@Component("UserValidator")
public class UserValidator {

	public boolean supports(@SuppressWarnings("rawtypes") Class clazz)
	{
		return UserRegister.class.isAssignableFrom(clazz);
	}

	public void validate(Object model, Errors errors)
	{
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username","required.username", "User Name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "f_name","required.f_name", "First Name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "l_name","required.l_name", "Last Name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email","required.email", "Email is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone","required.phone", "Phone Number is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address1","required.address1", "Address is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address2","required.address1", "address is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password","required.password", "Password is required.");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "QUESTION","required.QUESTION", "can not be blank.");
		
		/*ValidationUtils.rejectIfEmpty(errors, "START_DATE","required.SURVEY_NAME", "Enter date");*/
	}

}

