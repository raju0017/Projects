package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.ServicerequestBeanBPO;



@Repository("servicerequestDaoBPO")
public class ServicerequestDaoImplBPO implements ServicerequestDaoBPO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void Servicerequestpage(ServicerequestBeanBPO servicerequestBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(servicerequestBean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServicerequestBeanBPO> getServicerequests() {
		return (List<ServicerequestBeanBPO>) sessionFactory.getCurrentSession().createCriteria(ServicerequestBeanBPO.class).list();
	}

	@Override
	public ServicerequestBeanBPO getServicerequest(int sr_id) {
		return (ServicerequestBeanBPO) sessionFactory.getCurrentSession().get(ServicerequestBeanBPO.class, sr_id);
	}

	@SuppressWarnings("unchecked")
	@Override  
	public List<ServicerequestBeanBPO> getServicerequests(String parameter) {
		String str = parameter;
		System.out.println("Service is: "+ str);
		// TODO Auto-generated method stub
		return (List<ServicerequestBeanBPO>) sessionFactory.getCurrentSession().createQuery("from ServicerequestBeanBPO where sr_desc=:param or status =:param").setParameter("param", str).list();
		//return (List<ServicerequestBean>) sessionFactory.getCurrentSession().createCriteria(ServicerequestBean.class, str).list();
	}

	

}
