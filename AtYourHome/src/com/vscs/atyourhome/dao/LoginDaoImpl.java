package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.model.UserRegister;


import com.vscs.atyourhome.dao.LoginDao;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao{

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<UserRegister> listUsers() {
		return (List<UserRegister>) sessionFactory.getCurrentSession().createCriteria(UserRegister.class).list();

	}

	@Override
	public void saveUser(UserRegister user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserRegister> getUserByUserName(String username) {
		return sessionFactory.getCurrentSession().createQuery("from UserRegister where username=:username")
				.setString("username", username).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserRegister> validateLoginUser(String username, String password) {
		return sessionFactory.getCurrentSession()
				.createQuery("from UserRegister where username=:username and password=:password")
				.setString("username", username).setString("password", password).list();
	}

}
