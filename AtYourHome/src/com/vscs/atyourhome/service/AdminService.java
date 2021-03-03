package com.vscs.atyourhome.service;

import java.sql.SQLException;

public interface AdminService {

	
	public boolean isValidUser(String username, String password) throws SQLException;
	
}
