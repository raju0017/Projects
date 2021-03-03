package com.vscs.atyourhome.validators;

import java.util.regex.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.vscs.atyourhome.service.UserRegisterService;
import com.vscs.atyourhome.validators.UserForm;

@Component("userRegistrationValidator")
public class UserRegistrationValidator {
	@Autowired
	private UserRegisterService userService;
	
	public boolean supports(Class<?> klass) {
		return UserForm.class.isAssignableFrom(klass);
	  }
	
	public void validate(Object target, Errors errors){
		UserForm userForm = (UserForm) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobile","NotEmpty.userForm.mobile","phoneNo must not be Empty.");
		// check userEmail errors.....Start..............................
		if((userForm.getEmail()).length()>0){
			userForm.setEmail((userForm.getEmail().trim()));
			Pattern p=Pattern.compile(".+@.+\\.[a-z]+");
			Matcher m=p.matcher(userForm.getEmail());
			boolean b=m.matches();
			if(b!=true){
			  errors.rejectValue("email", "email.is.not.valid", "User Email not a well-formed email address.");
			 }else{
			  @SuppressWarnings("rawtypes")
			List userlist=userService.getUserByUserName(userForm.getUsername());
			  if(userlist!=null && userlist.size()>0){
				  errors.rejectValue("username", "matchusername.memberForm.userName", "User userName already exist.");
				}
			 }
	      }
		// check userEmail errors.....End.............................
		if(!(userForm.getPassword()).equals(userForm.getConfirmPassword())){
		  errors.rejectValue("password", "matchpassword.userForm.password","Password and Confirm Password do not match." );
		 }
	}
 }
