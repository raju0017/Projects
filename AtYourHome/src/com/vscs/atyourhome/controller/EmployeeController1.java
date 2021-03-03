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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.EmployeeBean1;
import com.vscs.atyourhome.service.EmployeeService1;


@Controller
public class EmployeeController1 {
	 @Autowired
	 EmployeeService1 employeeService;
	 
	 @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
		public ModelAndView saveEmployee(@ModelAttribute("command") EmployeeBean1 employee,
				BindingResult result) {
		 employeeService.addEmployee(employee);
			return new ModelAndView("redirect:/addEmployee.html");
		}
		@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
		public ModelAndView addEmployee(@ModelAttribute("command")  EmployeeBean1 employee,
				BindingResult result) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("employees",  employeeService.getEmployies());
			return new ModelAndView("addEmployee1", model);
		}
		
		@RequestMapping("/listEmployee")
		 public ModelAndView getEmployies() {
		  List<EmployeeBean1> employees =employeeService.getEmployies();
		  return new ModelAndView("listEmployee", "employees", employees);
		 }
		
		
		@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
		public ModelAndView editEmployee(@ModelAttribute("command") EmployeeBean1 employee,
				BindingResult result) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("employee",  employeeService.getEmployee(employee.getEmp_id()));
			model.put("employees",  employeeService.getEmployies());
			return new ModelAndView("addEmployee1", model);
		}
		
		/*@RequestMapping(value="/employees", method = RequestMethod.GET)
		public List<EmployeeBean> getEmployies() {
			return employeeService.getEmployies();
		}
		@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
		public ModelAndView deleteEmployee(@ModelAttribute("command")  EmployeeBean employee,
				BindingResult result) {
			employeeService.deleteEmployee(employee.getEmp_id());
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("employees",  employeeService.getEmployies());
			return new ModelAndView("addService", model);
		}*/
	 
		@RequestMapping(value = "/verifyEmail", method = RequestMethod.GET)
		public ModelAndView verifyEmail(@ModelAttribute("command") EmployeeBean1 employee) {
			//System.out.println("hi");
			String email = employee.getEmail();
			boolean emp= employeeService.verifyemail(email);
			if(emp){
				String successmsg="valid";
				return new ModelAndView("verification","successmsg",successmsg);
			}
			else{
				String failuremsg="already existed";
				return new ModelAndView("verification","failuremsg",failuremsg );

			}
		}
		
		@RequestMapping(value = "/verifyMobile")
		public ModelAndView verifyMobile(@RequestParam(value="mobile",required=true) int mobile) {
			boolean emp= employeeService.verifymobile(mobile);
			if(emp){
				String successmsg="valid";
				return new ModelAndView("verification","successmsg",successmsg);
			}
			else{
				String failuremsg="already existed";
				return new ModelAndView("verification","failuremsg",failuremsg );

			}
		}
		
}
