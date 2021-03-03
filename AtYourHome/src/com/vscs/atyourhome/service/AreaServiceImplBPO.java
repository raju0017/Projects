package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.AreaBeanBPO;
import com.vscs.atyourhome.dao.AreaDaoBPO;

/**
 * @author Dinesh Rajput
 *
 */

@Service("areaServiceBPO")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AreaServiceImplBPO implements AreaServiceBPO {
	
	@Autowired
	private AreaDaoBPO areaDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addArea(AreaBeanBPO areabean) {
		areaDao.addArea(areabean);
	}

	@Override
	public List<AreaBeanBPO> getAreas() {
		return areaDao.getAreas();
	}

	@Override
	public AreaBeanBPO getArea(int ar_id) {
		return areaDao.getArea(ar_id);
	}

	/*@Override
	public void deleteArea(int ar_id) {
		areaDao.deleteArea(ar_id);
	}*/

}
