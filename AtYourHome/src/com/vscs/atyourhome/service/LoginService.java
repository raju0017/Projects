package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.model.UserRegister;


public interface LoginService {

	public List<UserRegister> listUsers();

	public void saveUser(UserRegister user);

	public List<UserRegister> getUserByUserName(String userName);

	public List<UserRegister> validateLoginUser(String userName, String password);
}
