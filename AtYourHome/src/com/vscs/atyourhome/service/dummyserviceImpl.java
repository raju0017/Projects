package com.vscs.atyourhome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.dummy;
import com.vscs.atyourhome.dao.dummydao;

@Service("dummyservice")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class dummyserviceImpl implements dummyservice {

	@Autowired
	private dummydao cityDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addDummy(dummy ddd){
		cityDao.addDummy(ddd);
	}

}
