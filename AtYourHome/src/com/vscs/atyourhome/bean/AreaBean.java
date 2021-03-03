package com.vscs.atyourhome.bean;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="area" )
public class AreaBean {

	@Id
	@GeneratedValue
	private int ar_id;
	
	@Column(name = "ar_name")
	private String ar_name;
	
	@Column(name = "near_landmark")
	private String near_landmark;
	
	@OneToOne
    @JoinColumn(name="ct_id")
	private CityBean1 city;
	
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
	
	public CityBean1 getCity() {
		return city;
	}
	public void setCity(CityBean1 city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
