package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.Servicebean;

@Repository("serviceDao")
public class ServiceDaoImpl implements ServiceDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addService(Servicebean serviceBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(serviceBean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicebean> getServices() {
		return (List<Servicebean>) sessionFactory.getCurrentSession().createCriteria(Servicebean.class).list();	}

	@Override
	public Servicebean getService(int serv_id) {
		return (Servicebean) sessionFactory.getCurrentSession().get(Servicebean.class, serv_id);
	}

	/*@Override
	public void deleteService(int serv_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM ServiceBean WHERE serv_id = "+serv_id).executeUpdate();

	}*/

}
