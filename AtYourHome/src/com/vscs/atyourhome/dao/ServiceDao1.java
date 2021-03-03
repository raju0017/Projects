package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.ServiceBean1;

public interface ServiceDao1 {

public void addService(ServiceBean1 serviceBean);
	
	public List<ServiceBean1> getServices();
	
	public ServiceBean1 getService(int serv_id);
	
/*	public void deleteService(int serv_id);
*/}
