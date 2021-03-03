package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.Citybean;

public interface CityService {
	
	public void addCity(Citybean citybean);
	
	public List<Citybean> getCitys();
	
	public Citybean getCity(int ct_id);
	
}
