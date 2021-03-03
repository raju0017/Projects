package com.vscs.atyourhome.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.ServicerequestBeanBPO;
import com.vscs.atyourhome.service.AreaServiceBPO;
import com.vscs.atyourhome.service.ServicerequestServiceBPO;
import com.vscs.atyourhome.service.SrattendServiceBPO;
import com.vscs.atyourhome.service.SrdetailsServiceBPO;


@Controller
public class ServicerequestControllerBPO {
	
	@Autowired
	private SrdetailsServiceBPO srdetailsService;
	
	@Autowired
	private AreaServiceBPO areaService;
	
	@Autowired
	private ServicerequestServiceBPO servicerequestService;
	
	@Autowired
	private SrattendServiceBPO srattendService;
	
	@RequestMapping(value = "/getServiceDetails", method = RequestMethod.GET)
	public ModelAndView Servicerequestpage(@RequestParam(value = "service", required=true) String service, @ModelAttribute("command")  ServicerequestBeanBPO servicerequest,
			BindingResult result) {
		System.out.println("servie: "+ service);
		/*Map<String, Object> model = new HashMap<String, Object>();*/
		ModelAndView model = new ModelAndView("serviceRequestList");
		List<?> servicerequests = servicerequestService.getServicerequests(service);
		Iterator<?> itr = (Iterator<?>) servicerequests.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		model.addObject("servicerequests",servicerequests);
		//model.put("servicerequests",  servicerequests);
		//model.put("areas",  areaService.getAreas());
		//model.put("srattends",  srattendService.getSrattends());
		System.out.println("ServicesList: " +servicerequests.size() );
		//return new ModelAndView("servicerequestdetails", model);
		return model;
	}	
}
