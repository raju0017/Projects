package com.vscs.atyourhome.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;



@Entity
@Table(name ="city" )
public class Citybean {
  
	@Id
	@GeneratedValue
	private int ct_id;
	 
	@Column(name = "ct_name")
	private String ct_name;
	 
	@Column(name = "st_id_fk")
	private int st_id_fk;
	
	@Column(name = "eff_date")
	private String eff_date;
	
	private String status;
	
	@OneToMany
    @JoinColumn(name="city_id_fk")
	List <Servcitybean> servCityList = new ArrayList<Servcitybean>();
	
	
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

	public int getSt_id_fk() {
		return st_id_fk;
	}

	public void setSt_id_fk(int st_id_fk) {
		this.st_id_fk = st_id_fk;
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

	public List<Servcitybean> getServCityList() {
		return servCityList;
	}

	public void setServCityList(List<Servcitybean> servCityList) {
		this.servCityList = servCityList;
	}

	 public String toString() {
		   return ToStringBuilder.reflectionToString(this);
	 }
}
