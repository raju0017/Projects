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

import com.vscs.atyourhome.bean.SrattendBeanBPO;
import com.vscs.atyourhome.service.AreaServiceBPO;
import com.vscs.atyourhome.service.ServiceServiceBPO;
import com.vscs.atyourhome.service.SrattendServiceBPO;


@Controller
public class SrattendControllerBPO {
	
	/*@Autowired
	private SrdetailsService srdetailsService;
	*/
	@Autowired
	private SrattendServiceBPO srattendService;
	
	@Autowired
	private AreaServiceBPO areaService;
	
	@Autowired
	private ServiceServiceBPO serviceService;
	
	
	
	@RequestMapping(value = "/Srattendpage", method = RequestMethod.GET)
	public ModelAndView Srattendpage(@ModelAttribute("command")  SrattendBeanBPO srattend,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("srattends",  srattendService.getSrattends());
		model.put("areas",  areaService.getAreas());
		model.put("services",  serviceService.getServices());
		return new ModelAndView("Srattendpage", model);
	}                           
	
	
	/*
	@RequestMapping(value = "/assign", method = RequestMethod.GET)
	public ModelAndView editSrdetails(@ModelAttribute("command")  SrdetailsBean srdetails,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("srdetails",  srdetailsService.getSrdetails(srdetails.getSr_det_id()));
		model.put("srdetailss",  srdetailsService.getSrdetailss());
		return new ModelAndView("Sretailspage", model);
	}		*/
	
	
}
