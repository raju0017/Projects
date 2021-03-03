package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.SubServiceBean1;

public interface SubServiceDao1 {
 
	public void addSubService(SubServiceBean1 subserviceBean);
	
	public List<SubServiceBean1> getSubServices();
	
	public SubServiceBean1 getSubService(int sub_serv_id);
	
/*	public void deleteSubService(int sub_serv_id);
*/}
