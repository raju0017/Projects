package com.vscs.atyourhome.bean;

import java.util.Date;

/**
 * @author Dinesh Rajput
 *
 */
public class EmployeeBean {
	private Integer sr_id;
	private String sr_desc;
	private String sr_pers_name;
	private Integer phone;
	private String email;
	private String ar_name;
	private String address1;
	private String address2;
	private Date ep_date;
	private Date sr_date;
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
	public String getSr_pers_name() {
		return sr_pers_name;
	}
	public void setSr_pers_name(String sr_pers_name) {
		this.sr_pers_name = sr_pers_name;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAr_name() {
		return ar_name;
	}
	public void setAr_name(String ar_name) {
		this.ar_name = ar_name;
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
	public Date getEp_date() {
		return ep_date;
	}
	public void setEp_date(Date ep_date) {
		this.ep_date = ep_date;
	}
	public Date getSr_date() {
		return sr_date;
	}
	public void setSr_date(Date date) {
		this.sr_date = date;
	}
	public String getSub_serv_name() {
		return sub_serv_name;
	}
	public void setSub_serv_name(String sub_serv_name) {
		this.sub_serv_name = sub_serv_name;
	}


	
}
