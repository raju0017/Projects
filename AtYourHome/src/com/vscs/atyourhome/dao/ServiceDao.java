package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.Servicebean;

public interface ServiceDao {

public void addService(Servicebean serviceBean);
	
	public List<Servicebean> getServices();
	
	public Servicebean getService(int serv_id);
	
/*	public void deleteService(int serv_id);
*/}
