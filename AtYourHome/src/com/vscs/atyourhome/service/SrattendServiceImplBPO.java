package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.SrattendBeanBPO;
import com.vscs.atyourhome.dao.SrattendDaoBPO;


@Service("srattendServiceBPO")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SrattendServiceImplBPO implements SrattendServiceBPO {
	
	@Autowired
	private SrattendDaoBPO srattendDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void Srattendpage(SrattendBeanBPO srattendBean) {
		srattendDao.Srattendpage(srattendBean);
	}

	@Override
	public List<SrattendBeanBPO> getSrattends() {
		return srattendDao.getSrattends();
	}

	@Override
	public SrattendBeanBPO getSrattend(int sr_det_id) {
		return srattendDao.getSrattend(sr_det_id);
	}

	

}
