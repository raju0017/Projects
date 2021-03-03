package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.Citybean;

/**
 * @author Dinesh Rajput
 *
 */

@Repository("cityDao")
public class CityDaoImpl implements CityDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCity(Citybean citybean) {
		sessionFactory.getCurrentSession().saveOrUpdate(citybean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Citybean> getCitys() {
		return (List<Citybean>) sessionFactory.getCurrentSession().createCriteria(Citybean.class).list();
	}

	@Override
	public Citybean getCity(int ct_id) {
		return (Citybean) sessionFactory.getCurrentSession().get(Citybean.class, ct_id);
	}
	/*@Override
	public void deleteCity(int ct_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM CityBean WHERE ct_id = "+ct_id).executeUpdate();
	}*/

}
