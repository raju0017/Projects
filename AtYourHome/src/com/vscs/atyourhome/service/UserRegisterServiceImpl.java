package com.vscs.atyourhome.service;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.model.UserRegister;
import com.vscs.atyourhome.dao.UserRegisterDao;

@Service("userRegisterService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserRegisterServiceImpl implements UserRegisterService {

	@Autowired
	private UserRegisterDao userRegisterDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void registerUser(UserRegister userRegister) {
		userRegisterDao.registerUser(userRegister);
		
	}

	
	public List<UserRegister> registeredUsers() {
		return userRegisterDao.registeredUsers();
	}

	
	public UserRegister getRegisteredUsers(int userid) {
		return userRegisterDao.getRegisteredUsers(userid);
	}
	
	@Override
	public boolean isValidUser(String username, String password) throws SQLException
	{
			return userRegisterDao.isValidUser(username, password);
	}

	/*New Code Added From Here*/
	
	
	@Override
	public List<UserRegister> getUserByUserName(String username) {
		   return userRegisterDao.getUserByUserName(username);

	}


	@Override
	public List<UserRegister> validateLoginUser(String username, String password) {
		   return userRegisterDao.validateLoginUser(username, password);

	}

}
