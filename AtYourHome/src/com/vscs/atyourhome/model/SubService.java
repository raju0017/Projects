package com.vscs.atyourhome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="sub_service" )
public class SubService {
	
	@Id
	 @GeneratedValue
	 private int sub_serv_id;
	
	@Column(name = "sub_serv_desc")
	 private String sub_serv_desc;

	 @Column(name = "eff_date")
	 private String eff_date;

	 @Column(name = "serv_id_fk")
	 private int serv_id_fk;	 

	 private String status;

	public int getSub_serv_id() {
		return sub_serv_id;
	}

	public void setSub_serv_id(int sub_serv_id) {
		this.sub_serv_id = sub_serv_id;
	}

	public String getSub_serv_desc() {
		return sub_serv_desc;
	}

	public void setSub_serv_desc(String sub_serv_desc) {
		this.sub_serv_desc = sub_serv_desc;
	}

	public String getEff_date() {
		return eff_date;
	}

	public void setEff_date(String eff_date) {
		this.eff_date = eff_date;
	}

	public int getServ_id_fk() {
		return serv_id_fk;
	}

	public void setServ_id_fk(int serv_id_fk) {
		this.serv_id_fk = serv_id_fk;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	 
}
