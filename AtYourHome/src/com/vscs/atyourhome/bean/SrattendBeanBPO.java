package com.vscs.atyourhome.bean;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="service_attend")
public class SrattendBeanBPO {
	
	@Id
	@Column(name="serv_attend_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer serv_attend_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phoneno")
	private Integer phoneno;

	@Column(name="email")
	private String email;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="background_check")
	private String background_check;
	
	
	
	@OneToOne
    @JoinColumn(name="area_id_fk")
	private AreaBeanBPO area;
	
	@OneToOne
    @JoinColumn(name="serv_id_fk")
	private ServiceBeanBPO service;
	
	
	
	@Column(name="eff_date")
	private Date eff_date;
	
	@Column(name="status")
	private String status;

	public Integer getServ_attend_id() {
		return serv_attend_id;
	}

	public void setServ_attend_id(Integer serv_attend_id) {
		this.serv_attend_id = serv_attend_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Integer phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getBackground_check() {
		return background_check;
	}

	public void setBackground_check(String background_check) {
		this.background_check = background_check;
	}

	

	

	

	public AreaBeanBPO getArea() {
		return area;
	}

	public void setArea(AreaBeanBPO area) {
		this.area = area;
	}

	

	public ServiceBeanBPO getService() {
		return service;
	}

	public void setService(ServiceBeanBPO service) {
		this.service = service;
	}

	public Date getEff_date() {
		return eff_date;
	}

	public void setEff_date(Date eff_date) {
		this.eff_date = eff_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	
	
	
	
}
