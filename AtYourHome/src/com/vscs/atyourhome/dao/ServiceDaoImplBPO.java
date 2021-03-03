package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.EmployeeBPO;
import com.vscs.atyourhome.bean.ServiceBeanBPO;



@Repository("serviceDaoBPO")
public class ServiceDaoImplBPO implements ServiceDaoBPO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void Servicepage(ServiceBeanBPO serviceBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(serviceBean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceBeanBPO> getServices() {
		return (List<ServiceBeanBPO>) sessionFactory.getCurrentSession().createCriteria(ServiceBeanBPO.class).list();
	}

	@Override
	public ServiceBeanBPO getService(int serv_id) {
		return (ServiceBeanBPO) sessionFactory.getCurrentSession().get(ServiceBeanBPO.class, serv_id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<?> getEmployee(String sr_desc) {
		// TODO Auto-generated method stub
		return  (List<EmployeeBPO>) sessionFactory.getCurrentSession().createQuery("from EmployeeBPO where service=:service").setParameter("service", sr_desc).list();
	}

	

}
