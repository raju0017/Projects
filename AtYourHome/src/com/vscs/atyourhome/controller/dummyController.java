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

import com.vscs.atyourhome.bean.dummy;
import com.vscs.atyourhome.service.dummyservice;

@Controller
public class dummyController {

	@Autowired
	dummyservice ddd;
	
	@RequestMapping(value = "/saveDummy", method = RequestMethod.POST)
	public ModelAndView saveDummy(@ModelAttribute("command") dummy d, 
			BindingResult result) {
		ddd.addDummy(d);
		return new ModelAndView("redirect:/addDummy.html");
	}
	
	@RequestMapping(value = "/addDummy", method = RequestMethod.GET)
	public ModelAndView addDummy(@ModelAttribute("command")  dummy city,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("addDummy", model);
	}
	
}
