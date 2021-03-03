package com.vscs.atyourhome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="service" )
public class Service {

	
	@Id
	 @GeneratedValue
	 private int serv_id;

	 @Column(name = "serv_desc")
	 private String serv_desc;

	 @Column(name = "eff_date")
	 private String eff_date;

	 private String status;
	 

	public int getServ_id() {
		return serv_id;
	}

	public void setServ_id(int serv_id) {
		this.serv_id = serv_id;
	}

	public String getServ_desc() {
		return serv_desc;
	}

	public void setServ_desc(String serv_desc) {
		this.serv_desc = serv_desc;
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
