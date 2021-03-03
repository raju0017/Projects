package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.CityBean1;

public interface CityService1 {
	
	public void addCity(CityBean1 citybean);
	
	public List<CityBean1> getCitys();
	
	public CityBean1 getCity(int ct_id);
	
/*	public void deleteCity(int ct_id);
*/
}
