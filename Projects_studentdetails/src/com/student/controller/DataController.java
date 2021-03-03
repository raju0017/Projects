package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.student.domain.Student;
import com.student.services.DataService;

@Controller
public class DataController 
{	
	@Autowired
	DataService dataService;

	@RequestMapping("form.do")
	public ModelAndView getForm(@ModelAttribute Student student) {
		return new ModelAndView("test");
	}
	
	@RequestMapping("register.do")
	public ModelAndView registerUser(@ModelAttribute Student student) {
		dataService.insertRow(student);
		return new ModelAndView("redirect:list.do");
	}
	
	@RequestMapping("list.do")
	public ModelAndView getList()
	{
		List studentList = dataService.getList();
		
		return new ModelAndView("list","studentList",studentList);
	}
	
	@RequestMapping("delete.do")
	public ModelAndView deleteUser(@RequestParam int id) {
		dataService.deleteRow(id);
		return new ModelAndView("redirect:list.do");
	}
	
	@RequestMapping("edit.do")
	public ModelAndView editUser(@RequestParam int id,@ModelAttribute Student student) {
		Student studentObject = dataService.getRowById(id);
		return new ModelAndView("edit","studentObject",studentObject);
	}
	
	@RequestMapping("update.do")
	public ModelAndView updateUser(@ModelAttribute Student student) {
		dataService.updateRow(student);
		return new ModelAndView("redirect:list.do");
	}

}
