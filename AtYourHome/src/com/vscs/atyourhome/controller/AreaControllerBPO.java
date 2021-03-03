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

import com.vscs.atyourhome.bean.AreaBeanBPO;
import com.vscs.atyourhome.service.AreaServiceBPO;


@Controller
public class AreaControllerBPO {
	
	
	@Autowired
	private AreaServiceBPO areaService;
	
	@RequestMapping(value = "/BPOsaveArea", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") AreaBeanBPO area, 
			BindingResult result) {
		areaService.addArea(area);
		return new ModelAndView("redirect:/listArea.html");
	}
	
	@RequestMapping(value = "/BPOaddArea", method = RequestMethod.GET)
	public ModelAndView addArea(@ModelAttribute("command")  AreaBeanBPO area,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("areas",  areaService.getAreas());
		
		return new ModelAndView("addArea", model);
	}
	
	@RequestMapping("/BPOlistArea")
	 public ModelAndView getAreas() {
	  List<AreaBeanBPO> areas =  areaService.getAreas();
	  return new ModelAndView("listArea", "areas", areas);
	 }
	
	
	
	@RequestMapping(value = "/BPOeditArea", method = RequestMethod.GET)
	public ModelAndView editArea(@ModelAttribute("command")  AreaBeanBPO area,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("area",  areaService.getArea(area.getAr_id()));
		
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
