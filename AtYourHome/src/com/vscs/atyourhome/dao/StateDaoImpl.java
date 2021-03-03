package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.StateBean;

@Repository("stateDao")
public class StateDaoImpl implements StateDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void addState(StateBean stateBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(stateBean);
	}

	@SuppressWarnings("unchecked")
	public List<StateBean> getStates() {
		return (List<StateBean>) sessionFactory.getCurrentSession().createCriteria(StateBean.class).list();

	}

	@Override
	public StateBean getState(int st_id) {
		return (StateBean) sessionFactory.getCurrentSession().get(StateBean.class, st_id);

	}

	/*@Override
	public void deleteState(int st_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM StateBean WHERE st_id = "+st_id).executeUpdate();

	}*/

}
