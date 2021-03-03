package com.vscs.atyourhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.ServicerequestBeanBPO;
import com.vscs.atyourhome.service.ServicerequestServiceBPO;

@Controller
public class SearchControllerBPO {

	@Autowired
	public ServicerequestServiceBPO servicerequestService;
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam(value = "search" ) int request_id){
		/*System.out.println("hai");
		System.out.println("request_id: "+ request_id);
		int sr_id =(request_id);
		System.out.println("hai");*/
		ServicerequestBeanBPO searchService = servicerequestService.getServicerequest(request_id);
		ModelAndView model = new ModelAndView("Search");
		model.addObject("searchService", searchService);
		return model;
	}
}
