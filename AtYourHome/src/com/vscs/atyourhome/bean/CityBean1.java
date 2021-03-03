package com.vscs.atyourhome.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="city" )
public class CityBean1 {
  
	@Id
	@GeneratedValue
	private int ct_id;
	
	@Column(name = "ct_name")
	private String ct_name;
	 
	@OneToOne
    @JoinColumn(name="st_id")
	private StateBean state;
	
	@Column(name = "eff_date")
	private String eff_date;
	
	private String status;

	public int getCt_id() {
		return ct_id;
	}

	public void setCt_id(int ct_id) {
		this.ct_id = ct_id;
	}

	public String getCt_name() {
		return ct_name;
	}

	public void setCt_name(String ct_name) {
		this.ct_name = ct_name;
	}

	

	public StateBean getState() {
		return state;
	}

	public void setState(StateBean state) {
		this.state = state;
	}

	public String getEff_date() {
		return eff_date;
	}

	public void setEff_date(String eff_date) {
		this.eff_date = eff_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

