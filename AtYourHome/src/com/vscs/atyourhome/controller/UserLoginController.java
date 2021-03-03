package com.vscs.atyourhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.vscs.atyourhome.model.UserRegister;
import com.vscs.atyourhome.service.LoginService;
import com.vscs.atyourhome.validators.UserLoginValidator;

@Controller
@RequestMapping("/userlogin")
public class UserLoginController {

	@Autowired
	private UserLoginValidator userLoginValidator;
	@Autowired
	private LoginService loginService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showUserLogin(Map model, HttpSession session) {
		if (session.getAttribute("username") == null) {
			UserRegister user = new UserRegister();
			model.put("userRegister", user);
			return new ModelAndView("/userlogin");
		} else {
			return new ModelAndView("redirect:selectCity.html");
		}
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView processUserLogin(@Valid UserRegister user,
			BindingResult result, Map model, HttpSession session) {
		userLoginValidator.validate(user, result);
		if (result.hasErrors()) {
			return new ModelAndView("/userlogin");
		}
		List userlist = loginService.getUserByUserName(user.getUsername());
		if (userlist != null && userlist.size() > 0) {
			@SuppressWarnings("unused")
			UserRegister user1 = new UserRegister();
			user1 = (UserRegister) userlist.get(0);
			session.setAttribute("username", user.getUsername());
		}
		session.setAttribute("username", user.getUsername());
		return new ModelAndView("redirect:selectCity.html");
	}
}
