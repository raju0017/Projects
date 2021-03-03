package com.vscs.atyourhome.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.ServiceAssignBeanBPO;
//import com.vscs.atyourhome.bean.ServicerequestBeanBPO;


@Repository
@Transactional
public class ServiceAssignDaoImplBPO implements ServiceAssignDaoBPO {
	
    @Autowired
    SessionFactory sessionFactory;

	@Override
	public void updateStatus(String email) {
		System.out.println("Email2:" +email);
		String oldEmail = email;
		String newStatus = "inProgress";
		String hqlUpdate = "update ServicerequestBeanBPO set status = :newStatus where email = :oldEmail";
		// or String hqlUpdate = "update Customer set name = :newName where name = :oldName";
		sessionFactory.getCurrentSession().createQuery( hqlUpdate )
									        .setString( "newStatus", newStatus )
									        .setString( "oldEmail", oldEmail )
									        .executeUpdate();
	}

	@Override
	public void saveAssignService(ServiceAssignBeanBPO assignService) {
		
		 sessionFactory.getCurrentSession().saveOrUpdate(assignService);
		
		
	}
	
}
