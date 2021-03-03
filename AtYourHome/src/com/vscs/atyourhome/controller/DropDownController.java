/*package com.vscs.atyourhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.dao.DropDownDao;
import com.vscs.atyourhome.model.SubService;
import com.vscs.atyourhome.model.Service;
import com.vscs.atyourhome.model.DropDown;

@Controller
public class DropDownController {

	@Autowired
	private DropDownDao dropDownDao;
	
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

}
*/