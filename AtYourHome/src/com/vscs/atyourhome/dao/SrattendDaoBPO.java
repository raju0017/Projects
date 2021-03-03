package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.SrattendBeanBPO;

public interface SrattendDaoBPO {
	
	public void Srattendpage(SrattendBeanBPO srattendBean);
	
	public List<SrattendBeanBPO> getSrattends();
	
	public SrattendBeanBPO getSrattend(int sr_det_id);
	

}
