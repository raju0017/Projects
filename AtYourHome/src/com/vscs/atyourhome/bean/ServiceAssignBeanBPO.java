package com.vscs.atyourhome.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sr_assign")
public class ServiceAssignBeanBPO {
	

	private int id;
	private int userid;
	private String username;
	private String email;
	private String service;
	private String address1;
	private String address2;
	private String expdate;
	private int mobile;
	private String employee;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "userid")
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	@Column(name = "username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "service")
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	@Column(name = "address1")
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	@Column(name = "address2")
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@Column(name = "expdate")
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	
	@Column(name = "mobile")
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	@Column(name = "employee")
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	
	
}
