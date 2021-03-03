package com.vscs.atyourhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.service.ServicerequestServiceBPO;

@Controller
public class ServiceAssignedBPO {

	@Autowired
	private ServicerequestServiceBPO servicerequestService;
	
	@RequestMapping(value="/Bpohome")
	public ModelAndView home(){  
		List<?> servicerequestList = servicerequestService.getServicerequests();
		System.out.println("Service: "+ servicerequestList.size());
		ModelAndView model = new ModelAndView("Bpohome");
		model.addObject("servicerequestList", servicerequestList);
		return model;
	}
	
	@RequestMapping(value="/getServiceAssignedList")
	public ModelAndView serviceAssigned(@RequestParam(value = "status", required=true) String status){  
		List<?> serviceAssignedList = servicerequestService.getServicerequests(status);
		System.out.println("ServiceInactive: "+ serviceAssignedList.size());
		ModelAndView model = new ModelAndView("serviceAssignedList");
		model.addObject("serviceAssignedList", serviceAssignedList);
		return model;
	}
	
	@RequestMapping(value="/getServiceInProgressList")
	public ModelAndView serviceInProgress(){
		String status = "InProgress";     
		List<?> serviceInProgressList = servicerequestService.getServicerequests(status);
		System.out.println("ServiceInactive: "+ serviceInProgressList.size());
		ModelAndView model = new ModelAndView("ServiceInProgressList");
		model.addObject("serviceInProgressList", serviceInProgressList);
		return model;
	
	}

}
