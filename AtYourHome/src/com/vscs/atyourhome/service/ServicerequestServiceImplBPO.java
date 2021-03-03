   package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.ServicerequestBeanBPO;
import com.vscs.atyourhome.dao.ServicerequestDaoBPO;


@Service("servicerequestServiceBPO")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ServicerequestServiceImplBPO implements ServicerequestServiceBPO {
	
	@Autowired
	private ServicerequestDaoBPO servicerequestDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void Servicerequestpage(ServicerequestBeanBPO servicerequestBean) {
		servicerequestDao.Servicerequestpage(servicerequestBean);
	}

	@Override
	public List<ServicerequestBeanBPO> getServicerequests() {
		return servicerequestDao.getServicerequests();
	}

	@Override
	public ServicerequestBeanBPO getServicerequest(int sr_id) {
		return servicerequestDao.getServicerequest(sr_id);
	}

	@Override
	public List<ServicerequestBeanBPO> getServicerequests(String parameter) {
		// TODO Auto-generated method stub
		return servicerequestDao.getServicerequests(parameter);
	}

	

}
