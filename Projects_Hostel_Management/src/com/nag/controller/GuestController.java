package com.nag.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nag.model.Guest;
import com.nag.services.GuestService;
import com.sun.glass.ui.GestureSupport;

@Controller
public class GuestController {

	@Autowired
	private GuestService guestService;
	
	@RequestMapping("/index")
	public String setForm(Map<String, Object> map)
	{
		Guest guest = new Guest();
		map.put("guest", guest);
		map.put("guestList", guestService.getAll());
		  return "guest";
	}
	
	@RequestMapping(value = "/guest.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Guest guest, BindingResult result, @RequestParam String action, Map<String, Object> map)
	{
		Guest guestresult = new Guest();
		
		switch (action.toString()) {
		case "add":
			guestService.saveGuest(guest);
			guestresult = guest;
			break;
		case "edit":
			guestService.updateGuest(guest);
			guestresult = guest;
			break;
		case "delete":
			guestService.deleteGuest(guest);
			guestresult = guest;  
			break;
		case "search":
			Guest searchGuest = guestService.getById(guest.getId());
			guestresult = searchGuest != null ? searchGuest : new Guest();
			break;

		default:
			break;
		}
		
		map.put("student", guestresult);
		map.put("guestList", guestService.getAll());
		 return "guest";
	}
}
