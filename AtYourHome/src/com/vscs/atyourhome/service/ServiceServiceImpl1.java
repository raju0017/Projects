/**
 * 
 */
package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.dao.ServiceDaoImpl1;
import com.vscs.atyourhome.bean.ServiceBean1;

/**
 * @author swathi
 *
 */
@Service("serviceService1")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class ServiceServiceImpl1 implements ServiceService1 {

	@Autowired
	private ServiceDaoImpl1 serviceDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addService(ServiceBean1 serviceBean) {
		serviceDao.addService(serviceBean);
	}

	
	@Override
	public List<ServiceBean1> getServices() {
	
		return serviceDao.getServices();
	}

	
	@Override
	public ServiceBean1 getService(int serv_id) {
		return serviceDao.getService(serv_id) ;
	}

	
	/*@Override
	public void deleteService(int serv_id) {
		serviceDao.deleteService(serv_id);
	}*/

}
