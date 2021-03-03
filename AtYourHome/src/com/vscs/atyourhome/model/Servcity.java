package com.vscs.atyourhome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@SuppressWarnings("unused")
@Entity
@Table(name ="serv_city" )
public class Servcity {
  
	@Id
	@GeneratedValue
	private int serv_city_id;

    @Column(name="serv_id_fk")
	private int serviceId;
	
    @Column(name="city_id_fk")
	private int cityeId;

    
	@Column(name = "eff_date")
	private String eff_date;
	
	private String status;

	public int getServ_city_id() {
		return serv_city_id;
	}

	public void setServ_city_id(int serv_city_id) {
		this.serv_city_id = serv_city_id;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getCityeId() {
		return cityeId;
	}

	public void setCityeId(int cityeId) {
		this.cityeId = cityeId;
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

	@OneToOne
    @JoinColumn(name="serv_id_fk", insertable=false, updatable=false)
	private Service service;


	public Service getService() {
		return service;
	}

	public void setServicebean(Service service) {
		this.service = service;
	}	
	
	 
}
