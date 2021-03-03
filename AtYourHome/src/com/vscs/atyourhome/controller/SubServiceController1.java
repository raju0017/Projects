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

import com.vscs.atyourhome.bean.SubServiceBean1;
import com.vscs.atyourhome.service.ServiceService1;
import com.vscs.atyourhome.service.SubServiceService1;



@Controller

public class SubServiceController1 {
	@Autowired
	private SubServiceService1 subserviceService;
	
	@Autowired
	private ServiceService1 serviceService;
	
	@RequestMapping(value = "/saveSubService", method = RequestMethod.POST)
	public ModelAndView saveSubService(@ModelAttribute("command") SubServiceBean1 subservice, 
			BindingResult result) {
		subserviceService.addSubService(subservice);
		return new ModelAndView("redirect:/addSubService.html");
	}
	
	@RequestMapping(value = "/addSubService", method = RequestMethod.GET)
	public ModelAndView addPublication(@ModelAttribute("command")  SubServiceBean1 subservice,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("subservices",  subserviceService.getSubServices());
		model.put("services",  serviceService.getServices());
		return new ModelAndView("addSubService", model);
	}
	
	@RequestMapping("/listSubService")
	 public ModelAndView getSubServices(){
	  List<SubServiceBean1> subservices = subserviceService.getSubServices();
	  return new ModelAndView("listSubService", "subservices", subservices);
	 }
	
	
	@RequestMapping(value = "/editSubService", method = RequestMethod.GET)
	public ModelAndView editSubService(@ModelAttribute("command")  SubServiceBean1 subservice,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("subservice",  subserviceService.getSubService(subservice.getSub_serv_id()));
		model.put("subservices",  subserviceService.getSubServices());
		model.put("services",  serviceService.getServices());
		return new ModelAndView("addSubService", model);
	}
	
	
	
	
	
	/*@RequestMapping(value="/subservices", method = RequestMethod.GET)
	public List<SubServiceBean> getSubServices() {
		return subserviceService.getSubServices();
	}
	@RequestMapping(value = "/deleteSubService", method = RequestMethod.GET)
	public ModelAndView deletePublication(@ModelAttribute("command")  SubServiceBean subservice,
			BindingResult result) {
		subserviceService.deleteSubService(subservice.getSub_serv_id());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("subservices",  subserviceService.getSubServices());
		model.put("services",  serviceService.getServices());
		return new ModelAndView("addSubService", model);
	}*/
}
