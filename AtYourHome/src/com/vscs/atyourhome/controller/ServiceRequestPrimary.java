package com.vscs.atyourhome.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.Citybean;
import com.vscs.atyourhome.bean.OptionBean;
import com.vscs.atyourhome.bean.Servcitybean;
import com.vscs.atyourhome.service.CityService;
import com.vscs.atyourhome.service.ServcityService;
import com.vscs.atyourhome.service.ServiceService;


@Controller
public class ServiceRequestPrimary {
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private ServiceService serviceService;
	
	@Autowired
	private ServcityService servcityService;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	
	@RequestMapping(value = "/selectCity", method = RequestMethod.GET)
	public ModelAndView addCity(@ModelAttribute("command")  Citybean city,
			BindingResult result) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("citys",  cityService.getCitys());
		//model.put("services",  serviceService.getServices());
		
		Citybean citybean= (Citybean) sessionFactory.openSession().get(Citybean.class,2);
		
		
		
		model.put("servcitys",  servcityService.getServcitys());
		   System.out.println("output");
		
		   System.out.println(citybean);
			
		   //getSectionID();
		return new ModelAndView("addCity", model);
		
		
	}
	

	@RequestMapping(value = "/getCityServices", method = RequestMethod.GET)
	public ModelAndView addServcity(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println("cityId="+request.getParameter("cityId"));
		Citybean citybean= (Citybean) sessionFactory.openSession().get(Citybean.class,Integer.parseInt(request.getParameter("cityId")));
	    System.out.println(citybean);
	    OptionBean optionBean = null;
	    List<OptionBean> optionsList = new ArrayList<OptionBean>();
	    for(Servcitybean servcitybean : citybean.getServCityList()){
	    	optionBean = new OptionBean();
	    	optionBean.setId(servcitybean.getServicebean().getServ_id()+"");
	    	optionBean.setName(servcitybean.getServicebean().getServ_desc());
	    	optionsList.add(optionBean);	    }
	    model.put("optionsList",  optionsList);
		return new ModelAndView("dropDownOptions", model);
	}	

	@RequestMapping(value = "/go", method = RequestMethod.GET)
	public ModelAndView go(@ModelAttribute("command")  Citybean city,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("citys",  cityService.getCitys());
		model.put("services",  serviceService.getServices());		
		   // Citybean citybean= (Citybean) sessionFactory.openSession().get(Citybean.class,2);		
		
		model.put("servcitys",  servcityService.getServcitys());
		   //System.out.println("output");
		
		  // System.out.println(citybean);
			
		   //getSectionID();
		return new ModelAndView("ServiceRequest", model);
		
	}

}