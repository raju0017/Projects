package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.Servicebean;

public interface ServiceService {
	
	public void addService(Servicebean servicebean);
	
	public List<Servicebean> getServices();
	
	public Servicebean getService(int serv_id);
	

}
