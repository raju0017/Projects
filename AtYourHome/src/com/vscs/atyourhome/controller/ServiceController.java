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

import com.vscs.atyourhome.bean.Servicebean;
import com.vscs.atyourhome.service.ServiceService;

@Controller
public class ServiceController {
	
	@Autowired
	private ServiceService serviceService;
	
	
	
	@RequestMapping(value = "/addService1", method = RequestMethod.GET)
	public ModelAndView addService(@ModelAttribute("command")  Servicebean service,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("services",  serviceService.getServices());
	
		
		return new ModelAndView("addService", model);
	}
	
	
}
