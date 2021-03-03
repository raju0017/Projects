package com.vscs.atyourhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcknowledgeController {
	String message = "Thank You !";
	
	@RequestMapping("/Acknowledge")
	public ModelAndView showMessage() {
		return new ModelAndView("Acknowledge", "message", message);
	}
}
