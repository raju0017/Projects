package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.StateBean;

public interface StateDao {
	public void addState(StateBean stateBean);

	 public List<StateBean> getStates();

	 public StateBean getState(int st_id);

/*	 public void deleteState(int st_id);
*/}
