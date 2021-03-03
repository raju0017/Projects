package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.Servcitybean;



@Repository("categoryDao")
public class ServcityImpl implements ServcityDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addServcity(Servcitybean servcitybean) {
		sessionFactory.getCurrentSession().saveOrUpdate(servcitybean);
	}

	@SuppressWarnings("unchecked")
	
	@Override
	public List<Servcitybean> getServcitys() {
		return (List<Servcitybean>) sessionFactory.
				getCurrentSession().createCriteria(Servcitybean.class).list();
			}
	@Override
	public Servcitybean getServcity(int serv_city_id) {
		return (Servcitybean) sessionFactory.getCurrentSession().get(Servcitybean.class, serv_city_id);
	}

	

}
