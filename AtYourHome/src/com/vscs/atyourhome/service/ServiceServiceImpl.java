package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.Servicebean;
import com.vscs.atyourhome.dao.ServiceDao;


@Service("serviceService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ServiceServiceImpl implements ServiceService {

	@Autowired
	private ServiceDao serviceDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addService(Servicebean servicebean) {
		serviceDao.addService(servicebean);
	}

	public List<Servicebean> getServices() {
		return serviceDao.getServices();
	}

	@Override
	public Servicebean getService(int serv_id) {
		return serviceDao.getService(serv_id);
	}

	
	

}
