package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.ServCityBean1;

@Repository("servcityDao")
public class ServcityDaoImpl1 implements ServcityDao1 {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addServcity(ServCityBean1 servcitybean) {
		sessionFactory.getCurrentSession().saveOrUpdate(servcitybean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServCityBean1> getServcitys() {
		return (List<ServCityBean1>) sessionFactory.getCurrentSession().createCriteria(ServCityBean1.class).list();
	}

	@Override
	public ServCityBean1 getServcity(int serv_city_id) {
		return (ServCityBean1) sessionFactory.getCurrentSession().get(ServCityBean1.class, serv_city_id);
	}

	/*@Override
	public void deleteServcity(int Serv_city_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM ServCityBean WHERE Serv_city_id = "+Serv_city_id).executeUpdate();
	}*/

}
