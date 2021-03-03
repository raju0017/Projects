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

import com.vscs.atyourhome.bean.SubServiceBeanBPO;
import com.vscs.atyourhome.service.SubServiceServiceBPO;



@Controller

public class SubServiceControllerBPO {
	
	@Autowired
	private SubServiceServiceBPO subserviceService;
	
	@RequestMapping(value = "/BPOaddSubService", method = RequestMethod.GET)
	public ModelAndView addPublication(@ModelAttribute("command")  SubServiceBeanBPO subservice,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("subservices",  subserviceService.getSubServices());
		return new ModelAndView("addSubService", model);
	}
	
	
	
	
	
	
	
}
