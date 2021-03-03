package com.vscs.atyourhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Beauty {
	String message = "Welcome to At Your Home Beauty Services";

	@RequestMapping("/beauty")
	public ModelAndView showMessage() {
		return new ModelAndView("index", "message", message);
	}
}