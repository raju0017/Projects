package com.vscs.atyourhome.service;

import java.sql.SQLException;
import java.util.List;

import com.vscs.atyourhome.model.Employee;


/**
 * @author Dinesh Rajput
 *
 */
public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public boolean isValidAdmin(String emp_name, String address) throws SQLException;
	
/*	public void deleteEmployee(Employee employee);
*/}
