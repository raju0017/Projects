package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.Citybean;

public interface CityDao {
	
	public void addCity(Citybean citybean);
	
	public List<Citybean> getCitys();
	
	public Citybean getCity(int ct_id);
	
	/*public void deleteCity(int ct_id);*/
}
