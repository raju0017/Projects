package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.Servcitybean;
import com.vscs.atyourhome.dao.ServcityDao;



@Service("servcityService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ServcityServiceImpl implements ServcityService {
	
	@Autowired
	private ServcityDao servcityDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addServcity(Servcitybean servcitybean) {
		servcityDao.addServcity(servcitybean);
	}

	@Override
	public List<Servcitybean> getServcitys() {
		return servcityDao.getServcitys();
	}

	@Override
	public Servcitybean getServcity(int serv_city_id) {
		return servcityDao.getServcity(serv_city_id);
	}

	

}
