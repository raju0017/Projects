package com.vscs.atyourhome.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="dummy" )
public class dummy {

	@Id
	@SequenceGenerator(name = "seq_contacts", sequenceName = "seq_contacts")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_contacts")
	 private Integer sr_id;
	
	@Column(name = "serv_desc")
	private String sr_desc;
	
	@Column(name = "ep_date")
	private Date ep_date;
	
	@Column(name = "sr_date")
	private Date sr_date;
	
	@Column(name = "sub_serv_name")
	private String sub_serv_name;
	public Integer getSr_id() {
		return sr_id;
	}
	public void setSr_id(Integer sr_id) {
		this.sr_id = sr_id;
	}
	public String getSr_desc() {
		return sr_desc;
	}
	public void setSr_desc(String sr_desc) {
		this.sr_desc = sr_desc;
	}
	public Date getEp_date() {
		return ep_date;
	}
	public void setEp_date(Date ep_date) {
		this.ep_date = ep_date;
	}
	public Date getSr_date() {
		return sr_date;
	}
	public void setSr_date(Date sr_date) {
		this.sr_date = sr_date;
	}
	public String getSub_serv_name() {
		return sub_serv_name;
	}
	public void setSub_serv_name(String sub_serv_name) {
		this.sub_serv_name = sub_serv_name;
	}
	
	
}
