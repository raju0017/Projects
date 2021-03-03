package com.vscs.atyourhome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vscs.atyourhome.bean.ServiceAssignBeanBPO;
//import com.vscs.atyourhome.bean.ServicerequestBeanBPO;
import com.vscs.atyourhome.dao.ServiceAssignDaoBPO;

@Service
public class ServiceAssignServiceImplBPO implements ServiceAssignServiceBPO {
	
	@Autowired
	private ServiceAssignDaoBPO assignDao;

	@Override
	public void updateStatus(String email) {
		System.out.println("Email1:" + email);
		
		assignDao.updateStatus(email);
	}

	@Override
	public void saveAssignService(ServiceAssignBeanBPO assignService) {
		assignDao.saveAssignService(assignService);
	}


}
