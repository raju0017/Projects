package com.vscs.atyourhome.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sub_service")
public class SubServiceBean1 implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO) 
	 private Integer sub_serv_id;
	  
	@Column(name = "sub_serv_desc")
	 private String sub_serv_desc;
	
	  
	@OneToOne  
   @JoinColumn(name="serv_id")
	private ServiceBean1  service;
	  
	@Column(name = "eff_date")
	 private String eff_date;
	  
	 @Column(name = "status")
	 private String status;

	public Integer getSub_serv_id() {
		return sub_serv_id;
	}

	public void setSub_serv_id(Integer sub_serv_id) {
		this.sub_serv_id = sub_serv_id;
	}

	public String getSub_serv_desc() {
		return sub_serv_desc;
	}

	public void setSub_serv_desc(String sub_serv_desc) {
		this.sub_serv_desc = sub_serv_desc;
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
	
	 
}
