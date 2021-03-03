package com.vscs.atyourhome.delegate;

import java.sql.SQLException;


import com.vscs.atyourhome.service.AdminService;

public class AdminDelegate {

	
	private AdminService adminService;

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	

	public boolean isValidUser(String username, String password) throws SQLException
{
	    return adminService.isValidUser(username, password);
}
}
