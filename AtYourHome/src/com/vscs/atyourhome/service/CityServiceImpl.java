package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.Citybean;
import com.vscs.atyourhome.dao.CityDao;

@Service("cityService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityDao cityDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addCity(Citybean citybean) {
		cityDao.addCity(citybean);
	}

	@Override
	public List<Citybean> getCitys() {
		return cityDao.getCitys();
	}

	@Override
	public Citybean getCity(int ct_id) {
		return cityDao.getCity(ct_id);
	}

	
}
