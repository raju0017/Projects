package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.dao.LoginDao;
import com.vscs.atyourhome.model.UserRegister;

@Service("loginService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public List<UserRegister> listUsers() {
		return loginDao.listUsers();		

	}

	@Override
	public void saveUser(UserRegister user) {
		loginDao.saveUser(user);
		
	}

	@Override
	public List<UserRegister> getUserByUserName(String userName) {
		   return loginDao.getUserByUserName(userName);

	}

	@Override
	public List<UserRegister> validateLoginUser(String userName, String password) {
		   return loginDao.validateLoginUser(userName, password);

	}

}
