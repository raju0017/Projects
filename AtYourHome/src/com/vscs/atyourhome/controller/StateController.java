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

import com.vscs.atyourhome.bean.StateBean;
import com.vscs.atyourhome.service.CountryService;
import com.vscs.atyourhome.service.StateService;

@Controller
public class StateController {
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(value = "/saveState", method = RequestMethod.POST)
	public ModelAndView saveState(@ModelAttribute("command") StateBean state, 
			BindingResult result) {
		stateService.addState(state);
		return new ModelAndView("redirect:/addState.html");
	}
	
	@RequestMapping(value = "/addState", method = RequestMethod.GET)
	public ModelAndView addState(@ModelAttribute("command")   StateBean state,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("states",  stateService.getStates());
		model.put("countries",  countryService.getCountries());
		return new ModelAndView("addState", model);
	}
	
	@RequestMapping("/listState")
	 public ModelAndView getStates() {
	  List<StateBean> states =  stateService.getStates();
	  return new ModelAndView("listState", "states", states);
	 }
	
	
	
	@RequestMapping(value = "/editState", method = RequestMethod.GET)
	public ModelAndView editState(@ModelAttribute("command")   StateBean state,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("state",  stateService.getState(state.getSt_id()));
		model.put("states",  stateService.getStates());
		model.put("countries",  countryService.getCountries());
		return new ModelAndView("addState", model);
	}
	
	/*@RequestMapping(value="/states", method = RequestMethod.GET)
	public List<StateBean> getStates() {
		return stateService.getStates();
	}
	@RequestMapping(value = "/deleteState", method = RequestMethod.GET)
	public ModelAndView deleteState(@ModelAttribute("command")  StateBean state,
			BindingResult result) {
		stateService.deleteState(state.getSt_id());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("states",  stateService.getStates());
		model.put("countries",  countryService.getCountries());
		return new ModelAndView("addState", model);
	}*/
}
