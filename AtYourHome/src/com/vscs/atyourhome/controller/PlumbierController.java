package com.vscs.atyourhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlumbierController {
	String message = "Welcome to your 1st Maven Spring project !";

	@RequestMapping("/plumber")
	public ModelAndView showMessage() {
		return new ModelAndView("plummer", "message", message);
	}
}