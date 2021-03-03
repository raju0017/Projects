package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.ServCityBean1;
import com.vscs.atyourhome.dao.ServcityDao1;



@Service("servcityService1")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ServcityServiceImpl1 implements ServcityService1 {
	
	@Autowired
	private ServcityDao1 servcityDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addServcity(ServCityBean1 servcitybean) {
		servcityDao.addServcity(servcitybean);
	}

	@Override
	public List<ServCityBean1> getServcitys() {
		return servcityDao.getServcitys();
	}

	@Override
	public ServCityBean1 getServcity(int serv_city_id) {
		return servcityDao.getServcity(serv_city_id);
	}

	/*@Override
	public void deleteServcity(int serv_city_id) {
		servcityDao.deleteServcity(serv_city_id);
	}*/

}
