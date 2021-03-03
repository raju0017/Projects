package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.CityBean1;
import com.vscs.atyourhome.dao.CityDao1;



@Service("cityService1")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CityServiceImpl1 implements CityService1 {
	
	@Autowired
	private CityDao1 cityDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addCity(CityBean1 citybean) {
		cityDao.addCity(citybean);
	}

	@Override
	public List<CityBean1> getCitys() {
		return cityDao.getCitys();
	}

	@Override
	public CityBean1 getCity(int ct_id) {
		return cityDao.getCity(ct_id);
	}

	/*@Override
	public void deleteCity(int ct_id) {
		cityDao.deleteCity(ct_id);
	}*/

}
