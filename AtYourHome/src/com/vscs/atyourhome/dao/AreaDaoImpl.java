package com.vscs.atyourhome.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.AreaBean;

/**
 * @author Dinesh Rajput
 *
 */

@Repository("areaDao")
public class AreaDaoImpl implements AreaDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addArea(AreaBean areabean) {
		sessionFactory.getCurrentSession().saveOrUpdate(areabean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AreaBean> getAreas() {
		return (List<AreaBean>) sessionFactory.getCurrentSession().createCriteria(AreaBean.class).list();
	}

	@Override
	public AreaBean getArea(int ar_id) {
		return (AreaBean) sessionFactory.getCurrentSession().get(AreaBean.class, ar_id);
	}

	/*@Override
	public void deleteArea(int ar_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM AreaBean WHERE ar_id = "+ar_id).executeUpdate();
	}*/

}
