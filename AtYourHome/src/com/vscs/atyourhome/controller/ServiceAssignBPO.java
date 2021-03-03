package com.vscs.atyourhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.EmployeeBPO;
import com.vscs.atyourhome.bean.ServicerequestBeanBPO;
import com.vscs.atyourhome.service.ServiceServiceBPO;
import com.vscs.atyourhome.service.ServicerequestServiceBPO;

@Controller
public class ServiceAssignBPO {
	
	@Autowired
	private ServiceServiceBPO serviceService;
	
	@Autowired
	private ServicerequestServiceBPO servicerequestService;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/assign")
	public ModelAndView assign(@RequestParam(value = "sr_id",required = true) int sr_id,
			@RequestParam(value = "sr_desc",required = true) String service ){
		ModelAndView model = new ModelAndView("serviceAssign");
		ServicerequestBeanBPO customerDetails = (ServicerequestBeanBPO) servicerequestService.getServicerequest(sr_id);
		List<EmployeeBPO> employeeNames = (List<EmployeeBPO>) serviceService.getEmployee(service);
		model.addObject("customer", customerDetails);
		model.addObject("employee", employeeNames);
		return model;
		
	}

}
