package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.model.UserRegister;


public interface LoginDao {

	public List<UserRegister> listUsers();	
	public void saveUser(UserRegister user );
	public List<UserRegister> getUserByUserName(String username);
	public List<UserRegister> validateLoginUser(String username,String password);
}
