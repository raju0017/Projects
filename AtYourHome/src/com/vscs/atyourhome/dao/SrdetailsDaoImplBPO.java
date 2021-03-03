package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.SrdetailsBeanBPO;



/*

@Repository("srdetailsDao")
public class SrdetailsDaoImpl implements SrdetailsDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void Srdetailspage(SrdetailsBean srdetailsBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(srdetailsBean);
	}
	
	public void addSrdetails(SrdetailsBean srdetailsBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(srdetailsBean);
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SrdetailsBean> getSrdetailss() {
		return (List<SrdetailsBean>) sessionFactory.getCurrentSession().createCriteria(SrdetailsBean.class).list();
	}

	
	@Override
	public SrdetailsBean getSrdetails(int sr_det_id) {
		return (SrdetailsBean) sessionFactory.getCurrentSession().get(SrdetailsBean.class, sr_det_id);
	}

	

}
*/

@Repository("srdetailsDao")
public class SrdetailsDaoImplBPO implements SrdetailsDaoBPO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addSrdetails(SrdetailsBeanBPO srdetailsBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(srdetailsBean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SrdetailsBeanBPO> getSrdetailss() {
		return (List<SrdetailsBeanBPO>) sessionFactory.getCurrentSession().createCriteria(SrdetailsBeanBPO.class).list();
	}

	@Override
	public SrdetailsBeanBPO getSrdetails(int sr_det_id) {
		return (SrdetailsBeanBPO) sessionFactory.getCurrentSession().get(SrdetailsBeanBPO.class, sr_det_id);
	}

	@Override
	public void deleteSrdetails(int sr_det_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM SrdetailsBean WHERE sr_det_id = "+sr_det_id).executeUpdate();
	}
}