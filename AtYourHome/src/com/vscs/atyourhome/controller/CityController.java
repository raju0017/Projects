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

import com.vscs.atyourhome.bean.CityBean1;
import com.vscs.atyourhome.service.CityService1;
import com.vscs.atyourhome.service.StateService;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class CityController {
	
	@Autowired
	private CityService1 cityService;
	@Autowired
	private StateService stateService;
	
	
	@RequestMapping(value = "/saveCity", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") CityBean1 city, 
			BindingResult result) {
		cityService.addCity(city);
		return new ModelAndView("redirect:/addCity.html");
	}
	
	@RequestMapping(value = "/addCity", method = RequestMethod.GET)
	public ModelAndView addCity(@ModelAttribute("command")  CityBean1 city,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("states",  stateService.getStates());
		model.put("cities",  cityService.getCitys());
		return new ModelAndView("addCity1", model);
	}
	
	@RequestMapping("/listCity")
	 public ModelAndView getCitys() {
	  List<CityBean1> cities =  cityService.getCitys();
	  return new ModelAndView("listCity", "cities", cities);
	 }
	
	@RequestMapping(value = "/editCity", method = RequestMethod.GET)
	public ModelAndView editCity(@ModelAttribute("command")  CityBean1 city,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("city",  cityService.getCity(city.getCt_id()));
		model.put("states",  stateService.getStates());
		model.put("cities",  cityService.getCitys());
		return new ModelAndView("addCity1", model);
		
	}
	
	/*@RequestMapping(value="/cities", method = RequestMethod.GET)
	public List<CityBean> getCitys() {
		return cityService.getCitys();
	}
	
	@RequestMapping(value = "/deleteCity", method = RequestMethod.GET)
	public ModelAndView deleteCity(@ModelAttribute("command")  CityBean city,
			BindingResult result) {
		cityService.deleteCity(city.getCt_id());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("states",  stateService.getStates());
		model.put("cities",  cityService.getCitys());
		return new ModelAndView("addCity", model);
	}*/
}
