package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.EmployeeBPO;

@Repository
@Transactional
public class BpoLoginDaoImpl implements BpoLoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<EmployeeBPO> validate(String username, String password) {
		
		
		String compareSql = "from EmployeeBPO where emp_name = :username and emp_id =:password";
		@SuppressWarnings("unchecked")
		List<EmployeeBPO> employee = (List<EmployeeBPO>) sessionFactory.getCurrentSession().createQuery(compareSql)
									.setString("username", username)
									.setString("password", password)
									.list();
		return employee;
	}

}
