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

import com.vscs.atyourhome.bean.Servcitybean;
import com.vscs.atyourhome.service.CityService;
import com.vscs.atyourhome.service.ServcityService;
import com.vscs.atyourhome.service.ServiceService;


@Controller
public class ServcityController {
	
	@Autowired
	private ServcityService servcityService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private ServiceService serviceService;
	
	
	
	@RequestMapping(value = "/addServcity1", method = RequestMethod.GET)
	public ModelAndView addServcity(@ModelAttribute("command")  Servcitybean servcity,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("servcitys",  servcityService.getServcitys());
		model.put("services",  serviceService.getServices());
		model.put("citys",  cityService.getCitys());
		return new ModelAndView("addServcity", model);
	}
	
	/*@RequestMapping(value = "/getCityServices", method = RequestMethod.GET)
	public ModelAndView addServcity(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println("cityId="+request.getParameter("cityId"));
		Citybean citybean = cityService.getCity(Integer.parseInt(request.getParameter("cityId")));
		System.out.println(citybean);
		return new ModelAndView("addServcity", model);
	}	
	*/
}
