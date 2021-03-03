package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.SubServiceBean1;


@Repository("subserviceDao")
public class SubServiceDaoImpl1 implements SubServiceDao1 {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addSubService(SubServiceBean1 subserviceBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(subserviceBean);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SubServiceBean1> getSubServices() {
		return (List<SubServiceBean1>) sessionFactory.getCurrentSession().createCriteria(SubServiceBean1.class).list();

	}

	@Override
	public SubServiceBean1 getSubService(int sub_serv_id) {
		return (SubServiceBean1) sessionFactory.getCurrentSession().get(SubServiceBean1.class, sub_serv_id);

	}

	/*@Override
	public void deleteSubService(int sub_serv_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM SubServiceBean WHERE sub_serv_id = "+sub_serv_id).executeUpdate();

	}*/

}
