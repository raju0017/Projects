package com.vscs.atyourhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.ServiceAssignBeanBPO;
//import com.vscs.atyourhome.bean.ServicerequestBeanBPO;
import com.vscs.atyourhome.service.ServiceAssignServiceBPO;


@Controller
public class SuccessControllerBPO {
	
	
	
	
	@Autowired
	private ServiceAssignServiceBPO assignService;
	
	

	@RequestMapping(value= "/Success",method = RequestMethod.POST)
	public ModelAndView helloWorld(@ModelAttribute("command") ServiceAssignBeanBPO serviceAssign){
		
		ModelAndView model = new ModelAndView("Success");
		String username = serviceAssign.getUsername();
		System.out.println("username:" +username);
		String employee = serviceAssign.getEmployee();		
		String service = serviceAssign.getService();		
		String email = serviceAssign.getEmail();
		System.out.println("Email:" +email);

		assignService.updateStatus(email);
		assignService.saveAssignService(serviceAssign);
		model.addObject("username", username);
		model.addObject("service", service);
		model.addObject("employee",employee);
		
		return model;
	}
	
}
