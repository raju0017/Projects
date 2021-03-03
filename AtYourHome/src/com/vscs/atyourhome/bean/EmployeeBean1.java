package com.vscs.atyourhome.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="emp1" )
public class EmployeeBean1 {
  
	@Id
	@GeneratedValue
	 private int emp_id;
	
	@Column(name = "ename")
	 private String ename;
	
	 @Column(name = "email")
	 private String email;
	
	 @Column(name = "phoneno")
	 private Long phoneno;
	
	 @Column(name = "address1")
	 private String address1;
	
	 @Column(name = "address2")
	 private String address2;
	 
	 @Column(name = "eff_date")
	 private String eff_date;

	 private String status;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
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
