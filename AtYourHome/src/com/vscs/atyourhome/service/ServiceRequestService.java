package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.model.ServiceRequest;


/**
 * @author Dinesh Rajput
 *
 */
public interface ServiceRequestService {
	
	public void addSr(ServiceRequest sr);

	public List<ServiceRequest> listSr();
	
	public ServiceRequest getSr(int sr_id);
	
}
