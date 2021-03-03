package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.SubServiceBeanBPO;
import com.vscs.atyourhome.dao.SubServiceDaoBPO;

@Service("subserviceServiceBPO")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class SubServiceServiceImplBPO implements SubServiceServiceBPO {
	@Autowired
	private SubServiceDaoBPO subserviceDao;
	
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addSubService(SubServiceBeanBPO subserviceBean) {
		subserviceDao.addSubService(subserviceBean);
	}

	
	public List<SubServiceBeanBPO> getSubServices() {
		return subserviceDao.getSubServices();
	}

	@Override
	public SubServiceBeanBPO getSubService(int sub_serv_id) {
		
		return subserviceDao.getSubService(sub_serv_id);
	}

	/*@Override
	public void deleteSubService(int sub_serv_id) {
		subserviceDao.deleteSubService(sub_serv_id);
	}*/

}
