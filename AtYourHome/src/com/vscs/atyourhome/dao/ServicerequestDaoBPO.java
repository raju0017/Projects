package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.ServicerequestBeanBPO;

public interface ServicerequestDaoBPO {
	
	public void Servicerequestpage(ServicerequestBeanBPO servicerequestBean);
	
	public List<ServicerequestBeanBPO> getServicerequests();
	
	public List<ServicerequestBeanBPO> getServicerequests(String service);
	
	public ServicerequestBeanBPO getServicerequest(int sr_id);
	

}
