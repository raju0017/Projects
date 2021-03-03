package com.vscs.atyourhome.controller;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.ServiceBeanBPO;
import com.vscs.atyourhome.service.ServiceServiceBPO;



@Controller

public class ServiceControllerBPO {
	
	@Autowired
	private ServiceServiceBPO serviceService;
	
	@RequestMapping(value = "/Servicerequestpage", method = RequestMethod.GET)
	public ModelAndView Servicepage(@ModelAttribute("command")  ServiceBeanBPO service,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("services",  serviceService.getServices());
		return new ModelAndView("Servicerequestpage", model);
	}                           
	
	
	
	
	
	
	
}
