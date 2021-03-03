package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.AreaBeanBPO;

public interface AreaDaoBPO {
	
	public void addArea(AreaBeanBPO areabean);
	
	public List<AreaBeanBPO> getAreas();
	
	public AreaBeanBPO getArea(int ar_id);
	
/*	public void deleteArea(int ar_id);
*/}
