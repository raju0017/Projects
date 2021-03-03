package com.vscs.atyourhome.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sr_details")
public class SrdetailsBeanBPO {

	/*@Id
	@GeneratedValue
	private int sr_det_id;*/

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sr_det_id")
	private Integer sr_det_id;
	
	@OneToOne
    @JoinColumn(name="sr_id_fk")
	private ServicerequestBeanBPO servicerequest;
	
	@OneToOne
    @JoinColumn(name="sub_serv_id_fk")
	private SubServiceBeanBPO subservice;
	
	@OneToOne
    @JoinColumn(name="serv_attend_id_fk")
	private SrattendBeanBPO srattend;

	@Column(name="status")
	private String status;

	public Integer getSr_det_id() {
		return sr_det_id;
	}

	public void setSr_det_id(Integer sr_det_id) {
		this.sr_det_id = sr_det_id;
	}

	public ServicerequestBeanBPO getServicerequest() {
		return servicerequest;
	}

	public void setServicerequest(ServicerequestBeanBPO servicerequest) {
		this.servicerequest = servicerequest;
	}

	public SubServiceBeanBPO getSubservice() {
		return subservice;
	}

	public void setSubservice(SubServiceBeanBPO subservice) {
		this.subservice = subservice;
	}

	public SrattendBeanBPO getSrattend() {
		return srattend;
	}

	public void setSrattend(SrattendBeanBPO srattend) {
		this.srattend = srattend;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
