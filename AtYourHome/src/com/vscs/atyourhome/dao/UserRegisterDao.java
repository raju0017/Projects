package com.vscs.atyourhome.dao;

import java.sql.SQLException;
import java.util.List;

import com.vscs.atyourhome.model.UserRegister;



public interface UserRegisterDao {

	public void registerUser(UserRegister userRegister);

	public List<UserRegister> registeredUsers();
	
	public UserRegister getRegisteredUsers(int userid);

	public boolean isValidUser(String username, String password) throws SQLException;
	
	
	/*New Code Added Here*/
	
	public List<UserRegister> validateLoginUser(String username,String password);
	
	public List<UserRegister> getUserByUserName(String username);



	

}
