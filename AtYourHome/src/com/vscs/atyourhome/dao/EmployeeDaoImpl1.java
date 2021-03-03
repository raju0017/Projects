package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.EmployeeBean1;


@Repository("employeeDao")
public class EmployeeDaoImpl1 implements EmployeeDao1 {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addEmployee(EmployeeBean1 employeeBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(employeeBean);
		List<EmployeeBean1> emp= (List<EmployeeBean1>)sessionFactory.getCurrentSession().createCriteria(EmployeeBean1.class ).list();
		System.out.println("employees size"+ emp.size());
		
	}
	@SuppressWarnings("unchecked")

	@Override
	public List<EmployeeBean1> getEmployies() {
		return (List<EmployeeBean1>) sessionFactory.getCurrentSession().createCriteria(EmployeeBean1.class).list();	}


	@Override
	public EmployeeBean1 getEmployee(int emp_id) {
		return (EmployeeBean1) sessionFactory.getCurrentSession().get(EmployeeBean1.class, emp_id);

	}
	@Override
	public List<EmployeeBean1> verifyemail(String email) {
		
		@SuppressWarnings("unchecked")
		List<EmployeeBean1> emp = (List<EmployeeBean1>) sessionFactory.getCurrentSession().createQuery("from EmployeeBean1 where email=:requestemail")
														.setParameter("requestemail", email).list();
		
		return emp;
	}
	@Override
	public List<EmployeeBean1> verifymobile(int mobile) {
		@SuppressWarnings("unchecked")
		List<EmployeeBean1> emp = (List<EmployeeBean1>) sessionFactory.getCurrentSession().createQuery("from EmployeeBean1 where mobile=:requestMobile")
														.setParameter("requestMobile", mobile).list();
		
		return emp;
	}

	/*@Override
	public void deleteEmployee(int emp_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM EmployeeBean WHERE emp_id = "+emp_id).executeUpdate();

	}*/

}
