package com.vscs.atyourhome.service;

import java.sql.SQLException;
import java.util.List;

import com.vscs.atyourhome.model.UserRegister;


public interface UserRegisterService {

	
	public void registerUser(UserRegister userRegister);

	public List<UserRegister> registeredUsers();
	
	public UserRegister getRegisteredUsers(int userid);
	
	public boolean isValidUser(String username, String password) throws SQLException;

	public List<UserRegister> getUserByUserName(String username);

	public List<UserRegister> validateLoginUser(String username, String password);

	
}
