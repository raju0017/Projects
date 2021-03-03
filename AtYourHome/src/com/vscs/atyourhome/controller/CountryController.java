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

import com.vscs.atyourhome.bean.CountryBean;
import com.vscs.atyourhome.service.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(value = "/saveCountry", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") CountryBean country, 
			BindingResult result) {
		countryService.addCountry(country);
		return new ModelAndView("redirect:/addCountry.html");
	}
	
	@RequestMapping(value = "/addCountry", method = RequestMethod.GET)
	public ModelAndView addCountry(@ModelAttribute("command")  CountryBean country,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("countries",  countryService.getCountries());
		return new ModelAndView("addCountry", model);
	}
	@RequestMapping("/listCountry")
	 public ModelAndView getCountries() {
	  List<CountryBean> countries =  countryService.getCountries();
	  return new ModelAndView("listCountry", "countries", countries);
	 }
	
	
	@RequestMapping(value = "/editCountry", method = RequestMethod.GET)
	public ModelAndView editCountry(@ModelAttribute("command")  CountryBean country,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("country",  countryService.getCountry(country.getCnt_id()));
		model.put("countries",  countryService.getCountries());
		return new ModelAndView("addCountry", model);
	}
	
	/*@RequestMapping(value="/countries", method = RequestMethod.GET)
	public List<CountryBean> getCountries() {
		return countryService.getCountries();
	}
	@RequestMapping(value = "/deleteCountry", method = RequestMethod.GET)
	public ModelAndView deleteCountry(@ModelAttribute("command")  CountryBean country,
			BindingResult result) {
		countryService.deleteCountry(country.getCnt_id());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("countries",  countryService.getCountries());
		return new ModelAndView("addCountry", model);
	}*/
}
