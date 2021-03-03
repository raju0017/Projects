package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.AreaBean;
import com.vscs.atyourhome.dao.AreaDao;

/**
 * @author Dinesh Rajput
 *
 */

@Service("areaService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	private AreaDao areaDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addArea(AreaBean areabean) {
		areaDao.addArea(areabean);
	}

	@Override
	public List<AreaBean> getAreas() {
		return areaDao.getAreas();
	}

	@Override
	public AreaBean getArea(int ar_id) {
		return areaDao.getArea(ar_id);
	}

	/*@Override
	public void deleteArea(int ar_id) {
		areaDao.deleteArea(ar_id);
	}*/

}
