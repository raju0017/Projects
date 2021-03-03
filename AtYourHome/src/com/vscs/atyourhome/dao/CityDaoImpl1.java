package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.CityBean1;

@Repository("cityDao1")
public class CityDaoImpl1 implements CityDao1 {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCity(CityBean1 citybean) {
		sessionFactory.getCurrentSession().saveOrUpdate(citybean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CityBean1> getCitys() {
		return (List<CityBean1>) sessionFactory.getCurrentSession().createCriteria(CityBean1.class).list();
	}

	@Override
	public CityBean1 getCity(int ct_id) {
		return (CityBean1) sessionFactory.getCurrentSession().get(CityBean1.class, ct_id);
	}

	/*@Override
	public void deleteCity(int ct_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM CityBean WHERE ct_id = "+ct_id).executeUpdate();
	}*/

}
