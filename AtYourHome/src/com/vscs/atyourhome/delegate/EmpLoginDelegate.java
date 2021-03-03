package com.vscs.atyourhome.delegate;

import java.sql.SQLException;

import com.vscs.atyourhome.service.EmployeeService;



public class EmpLoginDelegate {

	
	private EmployeeService adminService;

	public EmployeeService getEmployeeService() {
		return adminService;
	}

	public void setEmployeeService(EmployeeService adminService) {
		this.adminService = adminService;
	}
	

	public boolean isValidAdmin(String emp_name, String address) throws SQLException
{
	    return adminService.isValidAdmin(emp_name, address);
}
}
