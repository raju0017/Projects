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

import com.vscs.atyourhome.bean.ServiceBean1;
import com.vscs.atyourhome.service.ServiceService1;

@Controller
public class ServiceController1 {

	@Autowired
	private ServiceService1 serviceService;
	
	@RequestMapping(value = "/saveService", method = RequestMethod.POST)
	public ModelAndView saveService(@ModelAttribute("command") ServiceBean1 service, 
			BindingResult result) {
		serviceService.addService(service);
		return new ModelAndView("redirect:/addService.html");
	}
	@RequestMapping(value = "/addService", method = RequestMethod.GET)
	public ModelAndView addCategory(@ModelAttribute("command")  ServiceBean1 service,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("services",  serviceService.getServices());
		return new ModelAndView("addService", model);
	}
	
	
	@RequestMapping(value = "/editService", method = RequestMethod.GET)
	public ModelAndView editCategory(@ModelAttribute("command") ServiceBean1 service,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("service",  serviceService.getService(service.getServ_id()));
		model.put("services",  serviceService.getServices());
		return new ModelAndView("addService", model);
	}
	
	/*@RequestMapping("/listService")
	 public ModelAndView getServices() {
	  List<ServiceBean> services = serviceService.getServices();
	  return new ModelAndView("listService", "services", services);
	 }*/
	
	@RequestMapping(value="/services", method = RequestMethod.GET)
	public List<ServiceBean1> getServices() {
		return serviceService.getServices();
	}
	/*@RequestMapping(value = "/deleteService", method = RequestMethod.GET)
	public ModelAndView deleteService(@ModelAttribute("command")  ServiceBean service,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("services",  serviceService.getServices());
		return new ModelAndView("addService", model);
	}*/
}
