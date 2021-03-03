package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.EmployeeBPO;
import com.vscs.atyourhome.bean.ServiceBeanBPO;
import com.vscs.atyourhome.dao.ServiceDaoBPO;


@Service("serviceServiceBPO")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ServiceServiceImplBPO implements ServiceServiceBPO {
	
	@Autowired
	private ServiceDaoBPO serviceDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void Servicepage(ServiceBeanBPO serviceBean) {
		serviceDao.Servicepage(serviceBean);
	}

	@Override
	public List<ServiceBeanBPO> getServices() {
		return serviceDao.getServices();
	}

	@Override
	public ServiceBeanBPO getService(int serv_id) {
		return serviceDao.getService(serv_id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeBPO> getEmployee(String service) {
		// TODO Auto-generated method stub
		return (List<EmployeeBPO>) serviceDao.getEmployee(service);
		
	}

	

}
