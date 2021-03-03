package com.vscs.atyourhome.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.UserRegisterBean;
import com.vscs.atyourhome.model.User;
import com.vscs.atyourhome.model.UserRegister;
import com.vscs.atyourhome.service.UserRegisterService;
import com.vscs.atyourhome.utils.Encryption;
import com.vscs.atyourhome.utils.UserValidator;
import com.vscs.atyourhome.validators.UserForm;

@SuppressWarnings("unused")
@Controller
public class UserRegistrationController {
	
	


	@Autowired
	private UserRegisterService userRegisterService;
	
	@Autowired
	private UserValidator userValidator;
	
	

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("command") UserRegisterBean userRegisterBean, BindingResult result) {

		userValidator.validate(userRegisterBean, result);
		if (result.hasErrors()) 
		{				
			return "registerUser";
		}
		UserRegister userRegister = prepareModel(userRegisterBean);
		userRegisterService.registerUser(userRegister);
		return "redirect:/selectCity.html";
	}

	private UserRegister prepareModel(UserRegisterBean userRegisterBean) {
		UserRegister userRegister = new UserRegister();
		userRegister.setUserId(userRegisterBean.getUser_id());
		userRegister.setUsername(userRegisterBean.getUsername());
		userRegister.setF_name(userRegisterBean.getF_name());
		userRegister.setL_name(userRegisterBean.getL_name());
		userRegister.setEmail(userRegisterBean.getEmail());
		userRegister.setMobile(userRegisterBean.getPhone());
		userRegister.setAddress1(userRegisterBean.getAddress1());
		userRegister.setAddress2(userRegisterBean.getAddress2());
		userRegister.setPassword(Encryption.encrypt(userRegisterBean.getPassword()));
		return userRegister;
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.GET)
	public ModelAndView addUser(@ModelAttribute("command") UserRegisterBean userRegisterBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("users", userRegisterService.registeredUsers());
		return new ModelAndView("registerUser", model);
	}

	/*
	 * private Object prepareListofBean(List<UserRegister> registeredUsers) {
	 * 
	 * List<UserRegisterBean> beans = null; if(registeredUsers != null &&
	 * !registeredUsers.isEmpty()){ beans = new ArrayList<UserRegisterBean>();
	 * UserRegisterBean bean = null; for(UserRegister userRegister :
	 * registeredUsers){ bean = new UserRegisterBean();
	 * bean.setAddress1(userRegister.getAddress1());
	 * bean.setAddress2(userRegister.getAddress2());
	 * bean.setEmail(userRegister.getEmail());
	 * bean.setF_name(userRegister.getF_name());
	 * bean.setL_name(userRegister.getL_name());
	 * bean.setPhone(userRegister.getMobile());
	 * bean.setUser_id(userRegister.getUserId());
	 * bean.setPassword(Encryption.encrypt(userRegister.getPassword()));
	 * bean.setUsername(userRegister.getUsername()); beans.add(bean); } }
	 * 
	 * return beans;
	 * 
	 * }
	 * 
	 * private UserRegisterBean prepareUserBean(UserRegister userRegister){
	 * UserRegisterBean bean = new UserRegisterBean();
	 * bean.setAddress1(userRegister.getAddress1());
	 * bean.setAddress2(userRegister.getAddress2());
	 * bean.setEmail(userRegister.getEmail());
	 * bean.setF_name(userRegister.getF_name());
	 * bean.setL_name(userRegister.getL_name());
	 * bean.setUser_id(userRegister.getUserId());
	 * bean.setUsername(userRegister.getUsername());
	 * bean.setPassword(userRegister.getPassword());
	 * bean.setPhone(userRegister.getMobile());
	 * 
	 * 
	 * return bean; }
	 */

}
