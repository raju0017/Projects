package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.EmployeeBean1;

public interface EmployeeDao1 {
	public void  addEmployee(EmployeeBean1 employeeBean);

	 public List<EmployeeBean1> getEmployies();

	 public EmployeeBean1 getEmployee(int emp_id);
	 
	 public List<EmployeeBean1> verifyemail(String email);
	 
	 public List<EmployeeBean1> verifymobile(int mobile);
	 
/*	 public void deleteEmployee(int emp_id);
*/}
