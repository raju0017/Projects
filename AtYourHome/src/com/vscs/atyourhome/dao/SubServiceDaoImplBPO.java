package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.SubServiceBeanBPO;


@Repository("subserviceDaoBPO")
public class SubServiceDaoImplBPO implements SubServiceDaoBPO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addSubService(SubServiceBeanBPO subserviceBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(subserviceBean);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SubServiceBeanBPO> getSubServices() {
		return (List<SubServiceBeanBPO>) sessionFactory.getCurrentSession().createCriteria(SubServiceBeanBPO.class).list();

	}

	@Override
	public SubServiceBeanBPO getSubService(int sub_serv_id) {
		return (SubServiceBeanBPO) sessionFactory.getCurrentSession().get(SubServiceBeanBPO.class, sub_serv_id);

	}

	/*@Override
	public void deleteSubService(int sub_serv_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM SubServiceBean WHERE sub_serv_id = "+sub_serv_id).executeUpdate();

	}*/

}
