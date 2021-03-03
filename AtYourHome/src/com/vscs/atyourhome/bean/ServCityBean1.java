package com.vscs.atyourhome.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name ="serv_city" )
public class ServCityBean1 {
  
	@Id
	@GeneratedValue
	private int serv_city_id;
	
	
	@OneToOne
    @JoinColumn(name="city_id_fk")
	private CityBean1 city;

	@OneToOne
    @JoinColumn(name="serv_id_fk")
	private ServiceBean1 service;
	
	
	
	@Column(name = "eff_date")
	private String eff_date;
	
	private String status;

	public int getServ_city_id() {
		return serv_city_id;
	}

	public void setServ_city_id(int serv_city_id) {
		this.serv_city_id = serv_city_id;
	}

	

	public CityBean1 getCity() {
		return city;
	}

	public void setCity(CityBean1 city) {
		this.city = city;
	}

	public ServiceBean1 getService() {
		return service;
	}

	public void setService(ServiceBean1 service) {
		this.service = service;
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

	/* @OneToMany
	    @JoinTable( name="serv_city", 
	                joinColumns=@JoinColumn(name="ct_id_fk"), 
	                inverseJoinColumns=@JoinColumn(name="serv_id_fk"))*/ 
	
	
	
}

