package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.model.ServiceRequest;;


/**
 * @author Dinesh Rajput
 *
 */
@Repository("srDao")
public class ServiceRequestDaoImpl implements ServiceRequestDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addSr(ServiceRequest sr) {
		sessionFactory.getCurrentSession().saveOrUpdate(sr);
	}

	@SuppressWarnings("unchecked")
	public List<ServiceRequest> listSr() {
		return (List<ServiceRequest>) sessionFactory.getCurrentSession().createCriteria(ServiceRequest.class).list();
	}

	public ServiceRequest getSr(int sr_id) {
		return (ServiceRequest) sessionFactory.getCurrentSession().get(ServiceRequest.class, sr_id);
	}

	/*public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Employee WHERE empid = "+employee.getEmpId()).executeUpdate();
	}*/

}
