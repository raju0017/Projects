
package com.vscs.atyourhome.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vscs.atyourhome.bean.EmployeeBean;
import com.vscs.atyourhome.model.Employee;
import com.vscs.atyourhome.service.EmployeeService;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class CityServiceSubServiceController {

	@Autowired
	private EmployeeService employeeService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") EmployeeBean employeeBean, BindingResult result) {
		Employee employee = prepareModel(employeeBean);
		employeeService.addEmployee(employee);
		return new ModelAndView("redirect:/Acknowledge.html");
	}

	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute("command") EmployeeBean employeeBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees", prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("addEmployee", model);
	}

	

	private Employee prepareModel(EmployeeBean employeeBean) {
		Employee employee = new Employee();
		employee.setAddress1(employeeBean.getAddress1());
		employee.setAddress2(employeeBean.getAddress2());
		employee.setAr_name(employeeBean.getAr_name());
		employee.setEmail(employeeBean.getEmail());
		employee.setEp_date(employeeBean.getEp_date());
		employee.setPhone(employeeBean.getPhone());
		employee.setSr_desc(employeeBean.getSr_desc());
		employee.setSr_id(employeeBean.getSr_id());
		employee.setSr_pers_name(employeeBean.getSr_pers_name());
		employee.setSub_serv_name(employeeBean.getSub_serv_name());
		employee.setSr_date(employeeBean.getSr_date());
		employeeBean.setSr_id(null);
		return employee;
	}

	private List<EmployeeBean> prepareListofBean(List<Employee> employees) {
		List<EmployeeBean> beans = null;
		if (employees != null && !employees.isEmpty()) {
			beans = new ArrayList<EmployeeBean>();
			EmployeeBean bean = null;
			for (Employee employee : employees) {
				bean = new EmployeeBean();
				bean.setAddress1(employee.getAddress1());
				bean.setAddress2(employee.getAddress2());
				bean.setAr_name(employee.getAr_name());
				bean.setEmail(employee.getEmail());
				bean.setEp_date(employee.getEp_date());
				bean.setSr_date(employee.getSr_date());
				bean.setSr_desc(employee.getSr_desc());
				bean.setSr_id(employee.getSr_id());
				bean.setSr_pers_name(employee.getSr_pers_name());
				bean.setSub_serv_name(employee.getSub_serv_name());
				bean.setPhone(employee.getPhone());
				beans.add(bean);
			}
		}
		return beans;
	}

	@SuppressWarnings("unused")
	private EmployeeBean prepareEmployeeBean(Employee employee) {
		EmployeeBean bean = new EmployeeBean();
		bean.setAddress1(employee.getAddress1());
		bean.setAddress2(employee.getAddress2());
		bean.setAr_name(employee.getAr_name());
		bean.setEmail(employee.getEmail());
		bean.setEp_date(employee.getEp_date());
		bean.setSr_date(employee.getSr_date());
		bean.setSr_desc(employee.getSr_desc());
		bean.setSr_id(employee.getSr_id());
		bean.setSr_pers_name(employee.getSr_pers_name());
		bean.setSub_serv_name(employee.getSub_serv_name());
		return bean;
	}
}
