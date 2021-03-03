package com.vscs.atyourhome.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.vscs.atyourhome.dao.AdminDao;
import com.vscs.atyourhome.service.AdminService;

@Service("adminService")
public class AdminServiceimpl  implements AdminService{

	
	private AdminDao adminDao;

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	@Override
	public boolean isValidUser(String username, String password) throws SQLException
	{
			return adminDao.isValidUser(username, password);
	}
	
	
}
