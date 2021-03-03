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

import com.vscs.atyourhome.bean.SrdetailsBeanBPO;
import com.vscs.atyourhome.service.ServicerequestServiceBPO;
import com.vscs.atyourhome.service.SrattendServiceBPO;
import com.vscs.atyourhome.service.SrdetailsServiceBPO;
import com.vscs.atyourhome.service.SubServiceServiceBPO;




@Controller
public class SrdetailsControllerBPO {
	
	@Autowired
	private SrdetailsServiceBPO srdetailsService;
	  
	@Autowired
	private SubServiceServiceBPO subserviceService;
	
	@Autowired
	private ServicerequestServiceBPO servicerequestService;
	  
	@Autowired
	private SrattendServiceBPO srattendService;
	
	/*@RequestMapping(value = "/Srdetailspage", method = RequestMethod.GET)
	public ModelAndView Srdetailspage(@ModelAttribute("command")  SrdetailsBean srdetails,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("srdetailss",  srdetailsService.getSrdetailss());
		model.put("subservices",  subserviceService.getSubServices());
		model.put("srattends",  srattendService.getSrattends());
		model.put("servicerequests",  servicerequestService.getServicerequests());
		return new ModelAndView("Srdetailspage", model);
	}
	
	
	@RequestMapping(value = "/assign", method = RequestMethod.GET)
	public ModelAndView assign(@ModelAttribute("command")  SrdetailsBean srdetails,
			BindingResult result, ServicerequestBean servicerequest) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("srdetails",  srdetailsService.getSrdetails(srdetails.getSr_det_id()));
		model.put("srdetailss",  srdetailsService.getSrdetailss());
		model.put("srattends",  srattendService.getSrattends());
		model.put("servicerequests",  servicerequestService.getServicerequest(servicerequest.getSr_id()));
		return new ModelAndView("Srdetailspage", model);
	}		
	
	@RequestMapping(value = "/savesrdetails", method = RequestMethod.GET)
	public ModelAndView saveSrdetails(@ModelAttribute("command") SrdetailsBean srdetails, 
			BindingResult result) {
		srdetailsService.addSrdetails(srdetails);
		
		return new ModelAndView("redirect:/Srdetailspage.html");
	}
	
	
	@RequestMapping(value = "/editSrdetails", method = RequestMethod.GET)
	public ModelAndView editSrdetails(@ModelAttribute("command")  SrdetailsBean srdetails,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("srdetails",  srdetailsService.getSrdetails(srdetails.getSr_det_id()));
		model.put("srdetailss",  srdetailsService.getSrdetailss());
		
		model.put("srattends",  srattendService.getSrattends());
		model.put("servicerequests",  servicerequestService.getServicerequests());
		return new ModelAndView("Srdetailspage", model);
	}*/
	
	@RequestMapping(value = "/saveSrdetails", method = RequestMethod.POST)
	
	public ModelAndView saveSrdetails(@ModelAttribute("command") SrdetailsBeanBPO srdetails, 
			BindingResult result) {
		
		srdetailsService.addSrdetails(srdetails);
		
		System.out.println("aa");
		return new ModelAndView("redirect:/addSrdetails.html");
	}
	
	@RequestMapping(value = "/addSrdetails", method = RequestMethod.GET)
	public ModelAndView addSrdetails(@ModelAttribute("command")  SrdetailsBeanBPO srdetails,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("srdetailss",  srdetailsService.getSrdetailss());
		model.put("subservices",  subserviceService.getSubServices());
		model.put("srattends",  srattendService.getSrattends());
		model.put("servicerequests",  servicerequestService.getServicerequests());
		
		return new ModelAndView("addSrdetails", model);
	}
	
	@RequestMapping(value = "/deleteSrdetails", method = RequestMethod.GET)
	public ModelAndView deleteSrdetails(@ModelAttribute("command")  SrdetailsBeanBPO srdetails,
			BindingResult result) {
		srdetailsService.deleteSrdetails(srdetails.getSr_det_id());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("srdetailss",  srdetailsService.getSrdetailss());
		model.put("subservices",  subserviceService.getSubServices());
		model.put("srattends",  srattendService.getSrattends());
		model.put("servicerequests",  servicerequestService.getServicerequests());
		
		
		return new ModelAndView("addSrdetails", model);
	}
	
	@RequestMapping(value = "/editSrdetails", method = RequestMethod.GET)
	public ModelAndView editSrdetails(@ModelAttribute("command")  SrdetailsBeanBPO srdetails,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("srdetails", srdetailsService.getSrdetails(srdetails.getSr_det_id()));
		model.put("srdetailss",  srdetailsService.getSrdetailss());
		model.put("subservices",  subserviceService.getSubServices());
		model.put("srattends",  srattendService.getSrattends());
		model.put("servicerequests",  servicerequestService.getServicerequests());
		return new ModelAndView("addSrdetails", model);
	}
	
	@RequestMapping(value="/srdetailss", method = RequestMethod.GET)
	public List<SrdetailsBeanBPO> getSrdetailss() {
		return srdetailsService.getSrdetailss();
	}




}
