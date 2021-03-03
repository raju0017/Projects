package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.AreaBeanBPO;



@Repository("areaDaoBPO")
public class AreaDaoImplBPO implements AreaDaoBPO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addArea(AreaBeanBPO areabean) {
		sessionFactory.getCurrentSession().saveOrUpdate(areabean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AreaBeanBPO> getAreas() {
		return (List<AreaBeanBPO>) sessionFactory.getCurrentSession().createCriteria(AreaBeanBPO.class).list();
	}

	@Override
	public AreaBeanBPO getArea(int ar_id) {
		return (AreaBeanBPO) sessionFactory.getCurrentSession().get(AreaBeanBPO.class, ar_id);
	}

	/*@Override
	public void deleteArea(int ar_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM AreaBean WHERE ar_id = "+ar_id).executeUpdate();
	}*/

}
