package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.ServiceBean1;

@Repository("serviceDao1")
public class ServiceDaoImpl1 implements ServiceDao1 {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addService(ServiceBean1 serviceBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(serviceBean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceBean1> getServices() {
		return (List<ServiceBean1>) sessionFactory.getCurrentSession().createCriteria(ServiceBean1.class).list();	}

	@Override
	public ServiceBean1 getService(int serv_id) {
		return (ServiceBean1) sessionFactory.getCurrentSession().get(ServiceBean1.class, serv_id);
	}

	/*@Override
	public void deleteService(int serv_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM ServiceBean WHERE serv_id = "+serv_id).executeUpdate();

	}*/

}
