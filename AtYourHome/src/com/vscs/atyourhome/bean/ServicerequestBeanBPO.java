package com.vscs.atyourhome.bean;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.vscs.atyourhome.bean.AreaBeanBPO;
 
@Entity
@Table(name="sr")
public class ServicerequestBeanBPO {
	
	@Id
	@Column(name="sr_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sr_id;
	
	@OneToOne
    @JoinColumn(name="ar_id_fk")
	private AreaBeanBPO area;
	
	@Column(name="sr_desc")
	private String sr_desc;
	
	@Column(name="sr_pers_name")
	private String sr_pers_name;
	
	@Column(name="phone")
	private Integer phone;

	@Column(name="email")
	private String email;
	
	@Column(name="ep_date")
	private Date ep_date;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="status")
	private String status;

	
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

	public String getSr_pers_name() {
		return sr_pers_name;
	}

	public void setSr_pers_name(String sr_pers_name) {
		this.sr_pers_name = sr_pers_name;
	}

	public Integer getPhoneno() {
		return phone;
	}

	public void setPhoneno(Integer phoneno) {
		this.phone = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getEp_date() {
		return ep_date;
	}

	public void setEp_date(Date ep_date) {
		this.ep_date = ep_date;
	}

	public AreaBeanBPO getArea() {
		return area;
	}

	public void setArea(AreaBeanBPO area) {
		this.area = area;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	
}
