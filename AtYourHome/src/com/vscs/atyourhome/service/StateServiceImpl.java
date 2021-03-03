package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.StateBean;
import com.vscs.atyourhome.dao.StateDao;

@Service("stateService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class StateServiceImpl implements StateService {

	
	@Autowired
	private StateDao stateDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addState(StateBean stateBean) {
		stateDao.addState(stateBean);
	}

	@Override
	public List<StateBean> getStates() {
		return stateDao.getStates();
	}

	@Override
	public StateBean getState(int st_id) {
		
		return stateDao.getState(st_id);
	}

	/*@Override
	public void deleteState(int st_id) {
		stateDao.deleteState(st_id);
	}*/

}
