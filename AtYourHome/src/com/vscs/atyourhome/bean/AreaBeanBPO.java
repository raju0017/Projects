package com.vscs.atyourhome.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="area" )
public class AreaBeanBPO {

	@Id
	@GeneratedValue
	private int ar_id;
	
	@Column(name = "ar_name")
	private String ar_name;
	
	@Column(name = "near_landmark")
	private String near_landmark;
	
	@Column(name = "ct_id_fk")
	private Integer ct_id_fk;
	
	@Column(name = "status")
	private String status;

	public int getAr_id() {
		return ar_id;
	}

	public void setAr_id(int ar_id) {
		this.ar_id = ar_id;
	}

	public String getAr_name() {
		return ar_name;
	}

	public void setAr_name(String ar_name) {
		this.ar_name = ar_name;
	}

	public String getNear_landmark() {
		return near_landmark;
	}

	public void setNear_landmark(String near_landmark) {
		this.near_landmark = near_landmark;
	}

	public Integer getCt_id_fk() {
		return ct_id_fk;
	}

	public void setCt_id_fk(Integer ct_id_fk) {
		this.ct_id_fk = ct_id_fk;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
