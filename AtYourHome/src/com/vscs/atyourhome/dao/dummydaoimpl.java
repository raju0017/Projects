package com.vscs.atyourhome.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.dummy;

@Repository("dd")
public class dummydaoimpl implements dummydao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addDummy(dummy dd) {
		sessionFactory.getCurrentSession().saveOrUpdate(dd);

		
	}

}
