package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.EmployeeBean1;

public interface EmployeeService1 {
	public void  addEmployee(EmployeeBean1 employeeBean);

	 public List<EmployeeBean1> getEmployies();

	 public EmployeeBean1 getEmployee(int emp_id);

 public boolean verifyemail(String email);
	 
	 public boolean verifymobile(int mobile);
/*	 public void deleteEmployee(int emp_id);
*/}
