package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.model.ServiceRequest;

public interface ServiceRequestDao {
	
	public void addSr(ServiceRequest sr);

	public List<ServiceRequest> listSr();
	
	public ServiceRequest getSr(int sr_id);
	
}
