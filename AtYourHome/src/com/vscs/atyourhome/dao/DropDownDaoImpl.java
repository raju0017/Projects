package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DropDownDaoImpl implements DropDownDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List list() {
		Session session = sessionFactory.openSession();
		
		  List serviceList = (List) session.createQuery("from Service").list();
		return serviceList;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List list(int id) {
		 System.out.println(id);
		  Session session = sessionFactory.openSession();
		  List subServiceList = (List) session.createQuery("from SubService where serv_id_fk=:serv_id").setParameter("serv_id", id).list();
		  System.out.println(subServiceList.size());
		  return  subServiceList;
		
	}

}
