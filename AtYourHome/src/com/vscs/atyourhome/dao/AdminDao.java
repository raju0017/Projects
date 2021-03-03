package com.vscs.atyourhome.dao;

import java.sql.SQLException;

public interface AdminDao {
	
	public boolean isValidUser(String username, String password) throws SQLException;

}
