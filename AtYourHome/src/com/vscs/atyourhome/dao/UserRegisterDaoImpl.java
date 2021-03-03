package com.vscs.atyourhome.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.model.UserRegister;

@Repository("UserRegisterDao")
public class UserRegisterDaoImpl implements UserRegisterDao {
	
	DataSource dataSource;


	@Autowired
	private SessionFactory sessionFactory;

	
	public void registerUser(UserRegister userRegister) {
		sessionFactory.getCurrentSession().saveOrUpdate(userRegister);

	}

	
	@SuppressWarnings("unchecked")
	public List<UserRegister> registeredUsers() {
		return (List<UserRegister>) sessionFactory.getCurrentSession().createCriteria(UserRegister.class).list();
	}

	
	public UserRegister getRegisteredUsers(int userid) {
		return (UserRegister) sessionFactory.getCurrentSession().get(UserRegister.class, userid);
	}
	
	@Override
	public boolean isValidUser(String username, String password) throws SQLException
	{
			String query = "Select count(1) from user where username = ? and password = ?";
			PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet resultSet = pstmt.executeQuery();
			if (resultSet.next())
					return (resultSet.getInt(1) > 0);
			else
					return false;
	}

	
	
	/*New Code Added Here*/
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserRegister> getUserByUserName(String username) {
		return sessionFactory.getCurrentSession().createQuery("from User where username=:username")
				.setString("username", username).list();

	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserRegister> validateLoginUser(String username, String password) {
		return sessionFactory.getCurrentSession()
				.createQuery("from User where username=:username and password=:password")
				.setString("userName", username).setString("password", password).list();
	}


	
	
}
