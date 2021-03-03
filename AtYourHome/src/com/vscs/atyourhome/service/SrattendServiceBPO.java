package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.SrattendBeanBPO;

public interface SrattendServiceBPO {
	
	public void Srattendpage(SrattendBeanBPO srattendBean);
	
	public List<SrattendBeanBPO> getSrattends();
	
	public SrattendBeanBPO getSrattend(int sr_det_id);
	


}
