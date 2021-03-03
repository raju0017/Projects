package com.vscs.atyourhome.validators;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.vscs.atyourhome.model.UserRegister;
import com.vscs.atyourhome.service.LoginService;
import com.vscs.atyourhome.utils.Encryption;

@Component("userLoginValidator")
public class UserLoginValidator {
	@Autowired
	private LoginService loginService;

	public boolean supports(Class<?> klass) {
		return UserRegister.class.isAssignableFrom(klass);
	}

	public void validate(Object target, Errors errors) {
		UserRegister user = (UserRegister) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username",
				"NotEmpty.user.username", "UserName must not be Empty.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"NotEmpty.user.password", "Password must not be Empty.");

		if ((user.getUsername() != null) && (user.getUsername().length() > 0)) {
			user.setUsername(user.getUsername().trim());
			@SuppressWarnings("rawtypes")
			List userlist = loginService.validateLoginUser(user.getUsername(),Encryption.encrypt(user.getPassword())
					);
			if ((userlist != null) && (userlist.size() > 0)) {
			} else {
				errors.rejectValue("username",
						"notMatchUserNameAndPassword.user.username",
						"User Email or Password you entered is incorrect.");
			}

		}

	}

}
