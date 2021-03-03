package com.vscs.atyourhome.service;


import com.vscs.atyourhome.bean.ServiceAssignBeanBPO;
//import com.vscs.atyourhome.bean.ServicerequestBeanBPO;

public interface ServiceAssignServiceBPO {
	
	public void updateStatus(String email);
	public void saveAssignService(ServiceAssignBeanBPO serviceRequest);
	
}
