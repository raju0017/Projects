package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.SrdetailsBeanBPO;
import com.vscs.atyourhome.dao.SrdetailsDaoBPO;




/*@Service("srdetailsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SrdetailsServiceImpl implements SrdetailsService {
	
	@Autowired
	private SrdetailsDao srdetailsDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void Srdetailspage(SrdetailsBean srdetailsBean) {
		srdetailsDao.Srdetailspage(srdetailsBean);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addSrdetails(SrdetailsBean srdetailsBean) {
		srdetailsDao.addSrdetails(srdetailsBean);
	}
	
	
	@Override
	public List<SrdetailsBean> getSrdetailss() {
		return srdetailsDao.getSrdetailss();
	}

	@Override
	public SrdetailsBean getSrdetails(int sr_det_id) {
		return srdetailsDao.getSrdetails(sr_det_id);
	}

	

}
*/

@Service("srdetailsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SrdetailsServiceImplBPO implements SrdetailsServiceBPO {

	@Autowired
	private SrdetailsDaoBPO srdetailsDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addSrdetails(SrdetailsBeanBPO srdetailsBean) {
		srdetailsDao.addSrdetails(srdetailsBean);
	}

	public List<SrdetailsBeanBPO> getSrdetailss() {
		return srdetailsDao.getSrdetailss();
	}

	@Override
	public SrdetailsBeanBPO getSrdetails(int sr_det_id) {
		return srdetailsDao.getSrdetails(sr_det_id);
	}

	@Override
	public void deleteSrdetails(int sr_det_id) {
		srdetailsDao.deleteSrdetails(sr_det_id);
	}

}
