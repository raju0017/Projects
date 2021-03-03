package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.SubServiceBeanBPO;

public interface SubServiceServiceBPO {

	
	public void addSubService(SubServiceBeanBPO subserviceBean);
	
	public List<SubServiceBeanBPO> getSubServices();
	
	public SubServiceBeanBPO getSubService(int sub_serv_id);
	
/*	public void deleteSubService(int sub_serv_id);
*/}
