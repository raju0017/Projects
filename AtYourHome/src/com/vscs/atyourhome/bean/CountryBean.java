package com.vscs.atyourhome.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table(name ="country" )
public class CountryBean {
  
	@Id
	 @Column(name="cnt_id") 
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int cnt_id;
	
	
	@Column(name = "cnt_name")
	 private String	cnt_name;
	
	 @Column(name = "eff_date")
	 private String eff_date;

	public int getCnt_id() {
		return cnt_id;
	}

	public void setCnt_id(int cnt_id) {
		this.cnt_id = cnt_id;
	}

	public String getCnt_name() {
		return cnt_name;
	}

	public void setCnt_name(String cnt_name) {
		this.cnt_name = cnt_name;
	}

	public String getEff_date() {
		return eff_date;
	}

	public void setEff_date(String eff_date) {
		this.eff_date = eff_date;
	}
	 
	 
}
