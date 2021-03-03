package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.SubServiceBean1;
import com.vscs.atyourhome.dao.SubServiceDao1;

@Service("subserviceService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class SubServiceServiceImpl1 implements SubServiceService1 {
	@Autowired
	private SubServiceDao1 subserviceDao;
	
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addSubService(SubServiceBean1 subserviceBean) {
		subserviceDao.addSubService(subserviceBean);
	}

	
	public List<SubServiceBean1> getSubServices() {
		return subserviceDao.getSubServices();
	}

	@Override
	public SubServiceBean1 getSubService(int sub_serv_id) {
		
		return subserviceDao.getSubService(sub_serv_id);
	}

	/*@Override
	public void deleteSubService(int sub_serv_id) {
		subserviceDao.deleteSubService(sub_serv_id);
	}*/

}
