package com.vscs.atyourhome.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.ServCityBean1;
import com.vscs.atyourhome.service.CityService1;
import com.vscs.atyourhome.service.ServcityService1;
import com.vscs.atyourhome.service.ServiceService1;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class ServcityController1 {
	
	@Autowired
	private ServcityService1 servcityService;
	
	@Autowired
	private CityService1 cityService;
	
	@Autowired
	private ServiceService1 serviceService;
	
	@RequestMapping(value = "/saveServcity", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") ServCityBean1 servcity, 
			BindingResult result) {
		servcityService.addServcity(servcity);
		return new ModelAndView("redirect:/addServcity.html");
	}
	
	@RequestMapping(value = "/addServcity", method = RequestMethod.GET)
	public ModelAndView addServcity(@ModelAttribute("command")  ServCityBean1 servcity,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("servcitys",  servcityService.getServcitys());
		model.put("services",  serviceService.getServices());
		model.put("cities",  cityService.getCitys());
		return new ModelAndView("addServcity", model);
	}
	
	/*@RequestMapping("/listServcity")
	 public ModelAndView getServices() {
	  List<ServCityBean> servcitys = servcityService.getServcitys();
	  return new ModelAndView("listServcity", "servcitys", servcitys);
	 }*/
	
	@RequestMapping(value = "/editServcity", method = RequestMethod.GET)
	public ModelAndView editServcity(@ModelAttribute("command")  ServCityBean1 servcity,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("servcity",  servcityService.getServcity(servcity.getServ_city_id()));
		model.put("servcitys",  servcityService.getServcitys());
		
		return new ModelAndView("addServcity", model);
	}
	
	@RequestMapping(value="/servcitys", method = RequestMethod.GET)
	public List<ServCityBean1> getServcitys() {
		return servcityService.getServcitys();
	}/*
	@RequestMapping(value = "/deleteServcity", method = RequestMethod.GET)
	public ModelAndView deleteServcity(@ModelAttribute("command")  Servcitybean servcity,
			BindingResult result) {
		servcityService.deleteServcity(servcity.getServ_city_id());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("servcitys",  servcityService.getServcitys());
		model.put("services",  serviceService.getServices());
		model.put("cities",  cityService.getCitys());
		return new ModelAndView("addServcity", model);
	}*/
}
