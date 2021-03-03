package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.ServicerequestBeanBPO;

public interface ServicerequestServiceBPO {
	
	public void Servicerequestpage(ServicerequestBeanBPO servicerequestBean);
	
	public List<ServicerequestBeanBPO> getServicerequests();
	
	public List<ServicerequestBeanBPO> getServicerequests(String parameter);
	
	public ServicerequestBeanBPO getServicerequest(int sr_id);
	
	
	
	

}
