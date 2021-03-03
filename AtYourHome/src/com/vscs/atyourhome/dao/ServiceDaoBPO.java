package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.ServiceBeanBPO;

public interface ServiceDaoBPO {
	
	public void Servicepage(ServiceBeanBPO serviceBean);
	
	public List<ServiceBeanBPO> getServices();
	
	public ServiceBeanBPO getService(int serv_id);
	
	public List<?> getEmployee(String service);
	

}
