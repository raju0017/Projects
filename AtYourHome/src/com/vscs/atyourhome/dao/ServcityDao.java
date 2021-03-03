package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.Servcitybean;

public interface ServcityDao {
	
	public void addServcity(Servcitybean servcitybean);
	
	public List<Servcitybean> getServcitys();
	
	public Servcitybean getServcity(int serv_city_id);
	




}
