package com.vscs.atyourhome.service;

import java.sql.SQLException;

import com.vscs.atyourhome.dao.UserDao;
import com.vscs.atyourhome.service.UserService;

public class UserServiceImpl implements UserService
{

		private UserDao userDao;

		public UserDao getUserDao()
		{
				return this.userDao;
		}

		public void setUserDao(UserDao userDao)
		{
				this.userDao = userDao;
		}

		@Override
		public boolean isValidUser(String username, String password) throws SQLException
		{
				return userDao.isValidUser(username, password);
		}

}
