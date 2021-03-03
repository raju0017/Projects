package com.vscs.atyourhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.BpoLoginBean;
import com.vscs.atyourhome.service.BpoLoginService;


@Controller
@RequestMapping(value = "/bpoLogin")
public class BpoLoginController {
	
	@Autowired
	private BpoLoginService bpoLoginService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView adminLogin(@ModelAttribute("command") BpoLoginBean bpoLogin){
		
		ModelAndView model = new ModelAndView("bpoLogin");
		model.addObject(bpoLogin);
		return model;
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView validation(@ModelAttribute("command") BpoLoginBean bpoLogin){
		
		String username = bpoLogin.getUsername();
		String password = bpoLogin.getPassword();
	
		boolean value = bpoLoginService.validate(username, password);
		if(value){
			return new ModelAndView("redirect:Bpohome.html");
		}
		else{
			String errorMsg = "Please Emter the Correct Credentials";
			return new ModelAndView("bpoLogin","errorMsg",errorMsg);
		}
		
	}

}
