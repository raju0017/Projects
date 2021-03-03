package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.SrdetailsBeanBPO;



public interface SrdetailsServiceBPO {
	
	
/*	public void addSrdetails(SrdetailsBean srdetailsBean);

	
	public void Srdetailspage(SrdetailsBean srdetailsBean);
	
	public List<SrdetailsBean> getSrdetailss();
	
	public SrdetailsBean getSrdetails(int sr_det_id);
	
	
	*/

public void addSrdetails(SrdetailsBeanBPO srdetailsBean);
	
	public List<SrdetailsBeanBPO> getSrdetailss();
	
	public SrdetailsBeanBPO getSrdetails(int sr_det_id);
	
	public void deleteSrdetails(int sr_det_id);
}
