package com.vscs.atyourhome.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.service.AdminService;
import com.vscs.atyourhome.bean.AdminBean;




@Controller

public class AdminController {

	@Autowired
	private com.vscs.atyourhome.delegate.AdminDelegate adminDelegate;
	
	@SuppressWarnings("unused")
	@Autowired
	private AdminService adminService;
	
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public ModelAndView displayAdmin(HttpServletRequest request, HttpServletResponse response, AdminBean adminBean)
	{
		ModelAndView model = new ModelAndView("admin");
		//LoginBean loginBean = new LoginBean();
		model.addObject("AdminBean", adminBean);
		return model;
	}
	@RequestMapping(value="/admin",method=RequestMethod.POST)
	public ModelAndView executeAdmin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("AdminBean")AdminBean adminBean)
	{
			ModelAndView model= null;
			try
			{
					boolean isValidUser = adminDelegate.isValidUser(adminBean.getUsername(), adminBean.getPassword());
					if(isValidUser)
					{
							System.out.println("User Login Successful");
							request.setAttribute("loggedInUser",adminBean.getUsername());
							model = new ModelAndView("index1");
					}
					else
					{
							model = new ModelAndView("admin");
							request.setAttribute("message", "Invalid credentials!!");
					}

			}
			catch(Exception e)
			{
					e.printStackTrace();
			}

			return model;
	}
	
	
}
