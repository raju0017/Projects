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
@Table(name ="state" )
public class StateBean {
  
	@Id
	@Column(name="st_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer st_id;
	
	@Column(name = "st_name")
	private String st_name;
	
	@OneToOne
    @JoinColumn(name="cnt_id")
	private CountryBean country;
	
	@Column(name = "eff_date")
	private String eff_date;

	public Integer getSt_id() {
		return st_id;
	}

	public void setSt_id(Integer st_id) {
		this.st_id = st_id;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	

	public CountryBean getCountry() {
		return country;
	}

	public void setCountry(CountryBean country) {
		this.country = country;
	}

	public String getEff_date() {
		return eff_date;
	}

	public void setEff_date(String eff_date) {
		this.eff_date = eff_date;
	}

	
}
