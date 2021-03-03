package com.vscs.atyourhome.dao;


import com.vscs.atyourhome.bean.ServiceAssignBeanBPO;
//import com.vscs.atyourhome.bean.ServicerequestBeanBPO;

public interface ServiceAssignDaoBPO {
	
	public void updateStatus (String email);
	public void saveAssignService(ServiceAssignBeanBPO assignService);
}
