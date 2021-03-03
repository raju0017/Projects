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

import com.vscs.atyourhome.bean.AreaBean;
import com.vscs.atyourhome.service.AreaService;
import com.vscs.atyourhome.service.CityService1;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class AreaController {
	
	@Autowired
	private CityService1 cityService;
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value = "/saveArea", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") AreaBean area, 
			BindingResult result) {
		areaService.addArea(area);
		return new ModelAndView("redirect:/addArea.html");
	}
	                                                                                              
	@RequestMapping(value = "/addArea", method = RequestMethod.GET)
	public ModelAndView addArea(@ModelAttribute("command")  AreaBean area,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("cities",  cityService.getCitys());
		model.put("areas",  areaService.getAreas());
		
		return new ModelAndView("addArea", model);
	}
	
	@RequestMapping("/listArea")
	 public ModelAndView getAreas() {
	  List<AreaBean> areas =  areaService.getAreas();
	  return new ModelAndView("listArea", "areas", areas);
	 }
	
	
	
	@RequestMapping(value = "/editArea", method = RequestMethod.GET)
	public ModelAndView editArea(@ModelAttribute("command")  AreaBean area,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("area",  areaService.getArea(area.getAr_id()));
		model.put("cities",  cityService.getCitys());
		model.put("areas",  areaService.getAreas());
	  
		return new ModelAndView("addArea", model);
	}
	

	/*@RequestMapping(value = "/deleteArea", method = RequestMethod.GET)
	public ModelAndView deleteArea(@ModelAttribute("command")  AreaBean area,
			BindingResult result) {
		areaService.deleteArea(area.getAr_id());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("cities",  cityService.getCitys());
		model.put("areas",  areaService.getAreas());
		return new ModelAndView("addArea", model);
	}
	@RequestMapping(value="/areas", method = RequestMethod.GET)
	public List<AreaBean> getAreas() {
		return areaService.getAreas();
	}*/
}
