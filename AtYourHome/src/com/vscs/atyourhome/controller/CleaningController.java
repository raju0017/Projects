package com.vscs.atyourhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CleaningController {

	@RequestMapping("/cleaning")
	public ModelAndView showMessage() {
		return new ModelAndView("cleaning");
	}
}