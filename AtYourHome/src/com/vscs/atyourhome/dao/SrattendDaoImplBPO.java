package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.SrattendBeanBPO;



@Repository("srattendDaoBPO")
public class SrattendDaoImplBPO implements SrattendDaoBPO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void Srattendpage(SrattendBeanBPO srattendBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(srattendBean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SrattendBeanBPO> getSrattends() {
		return (List<SrattendBeanBPO>) sessionFactory.getCurrentSession().createCriteria(SrattendBeanBPO.class).list();
	}

	@Override
	public SrattendBeanBPO getSrattend(int sr_det_id) {
		return (SrattendBeanBPO) sessionFactory.getCurrentSession().get(SrattendBeanBPO.class, sr_det_id);
	}

	

}
