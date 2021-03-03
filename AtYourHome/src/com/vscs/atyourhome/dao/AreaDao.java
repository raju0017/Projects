package com.vscs.atyourhome.dao;

import java.util.List;



import com.vscs.atyourhome.bean.AreaBean;

public interface AreaDao {
	
	public void addArea(AreaBean areabean);
	
	public List<AreaBean> getAreas();
	
	public AreaBean getArea(int ar_id);
	
/*	public void deleteArea(int ar_id);
*/}
