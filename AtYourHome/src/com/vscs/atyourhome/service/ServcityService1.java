package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.ServCityBean1;

public interface ServcityService1 {
	
	public void addServcity(ServCityBean1 servcitybean);
	
	public List<ServCityBean1> getServcitys();
	
	public ServCityBean1 getServcity(int serv_city_id);
	
/*	public void deleteServcity(int serv_city_id);
*/
}
