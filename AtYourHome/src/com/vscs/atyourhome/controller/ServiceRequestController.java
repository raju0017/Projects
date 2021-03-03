
package com.vscs.atyourhome.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.ServiceRequestBean;
import com.vscs.atyourhome.dao.DropDownDao;
import com.vscs.atyourhome.model.DropDown;
import com.vscs.atyourhome.model.ServiceRequest;
import com.vscs.atyourhome.model.SubService;
import com.vscs.atyourhome.service.ServiceRequestService;


@Controller
public class ServiceRequestController {
	
	

	@Autowired
	private ServiceRequestService srService;

	
	@Autowired
	private DropDownDao dropDownDao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/saveSR", method = RequestMethod.POST)
	public ModelAndView saveSr(@ModelAttribute("command") ServiceRequestBean srBean, BindingResult result) {
		ServiceRequest sr = prepareModel(srBean);
		srService.addSr(sr);
		return new ModelAndView("redirect:/Acknowledge.html");
	}

	
	@RequestMapping(value ={"/DropDown"})
	public ModelAndView add(@ModelAttribute("dropDown") DropDown dropDown){
		ModelAndView model = new ModelAndView("selectservice");
		@SuppressWarnings("rawtypes")
		List serviceList = dropDownDao.list();
		model.addObject("serviceList",serviceList); 
		
		return model;
	}
	
	@RequestMapping(value = "/getSubService")
	public ModelAndView dropdown(@RequestParam(value = "serv_id", required=true) int serv_id){
		System.out.println(serv_id);
		@SuppressWarnings("rawtypes")
		List subServiceList =  dropDownDao.list(serv_id);
		ModelAndView model = new ModelAndView("selectservice");
		SubService subService=new SubService();
		model.addObject("subService",subService);
		model.addObject("subServiceList",subServiceList);
		return model;
		
	}

	
	 
	@RequestMapping(value = "/addSR", method = RequestMethod.GET)
	public ModelAndView addSr(@ModelAttribute("command") ServiceRequestBean srBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("sr", prepareListofBean(srService.listSr()));
		return new ModelAndView("selectservice", model);
	}

	
	 
	 

	private ServiceRequest prepareModel(ServiceRequestBean srBean) {
		ServiceRequest sreq = new ServiceRequest();
		sreq.setAddress1(srBean.getAddress1());
		sreq.setAddress2(srBean.getAddress2());
		sreq.setAr_name(srBean.getAr_name());
		sreq.setEmail(srBean.getEmail());
		sreq.setEp_date(srBean.getEp_date());
		sreq.setPhone(srBean.getPhone());
		sreq.setSr_desc(srBean.getSr_desc());
		sreq.setSr_id(srBean.getSr_id());
		sreq.setSr_pers_name(srBean.getSr_pers_name());
		sreq.setSub_serv_name(srBean.getSub_serv_name());
		sreq.setSr_date(srBean.getSr_date());
		
		return sreq;
	}

	private List<ServiceRequestBean> prepareListofBean(List<ServiceRequest> sreq) {
		List<ServiceRequestBean> beans = null;
		if (sreq != null && !sreq.isEmpty()) {
			beans = new ArrayList<ServiceRequestBean>();
			ServiceRequestBean bean = null;
			for (ServiceRequest sr : sreq) {
				bean = new ServiceRequestBean();
				bean.setAddress1(sr.getAddress1());
				bean.setAddress2(sr.getAddress2());
				bean.setAr_name(sr.getAr_name());
				bean.setEmail(sr.getEmail());
				bean.setEp_date(sr.getEp_date());
				bean.setSr_date(sr.getSr_date());
				bean.setSr_desc(sr.getSr_desc());
				bean.setSr_id(sr.getSr_id());
				bean.setSr_pers_name(sr.getSr_pers_name());
				bean.setSub_serv_name(sr.getSub_serv_name());
				bean.setPhone(sr.getPhone());
				beans.add(bean);
			}
		}
		return beans;
	}

	@SuppressWarnings("unused")
	private ServiceRequestBean prepareEmployeeBean(ServiceRequest sreq) {
		ServiceRequestBean srbean = new ServiceRequestBean();
		srbean.setAddress1(sreq.getAddress1());
		srbean.setPhone(sreq.getPhone());
		srbean.setAddress2(sreq.getAddress2());
		srbean.setAr_name(sreq.getAr_name());
		srbean.setEmail(sreq.getEmail());
		srbean.setEp_date(sreq.getEp_date());
		srbean.setSr_date(sreq.getSr_date());
		srbean.setSr_desc(sreq.getSr_desc());
		srbean.setSr_id(sreq.getSr_id());
		srbean.setSr_pers_name(sreq.getSr_pers_name());
		srbean.setSub_serv_name(sreq.getSub_serv_name());
		return srbean;
	}
}
