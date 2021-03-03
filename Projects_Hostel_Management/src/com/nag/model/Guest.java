package com.nag.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Paying_Guest")
public class Guest {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String address;
	@Column
	private long phone;
	@Column
	private Date joiningDate;
	@Column
	private Date endingDate;
	@Column
	private long advanceAmount;
	
	


	public Guest() {
		// TODO Auto-generated constructor stub
	}


	public Guest(int id, String name, String email, String address, long phone, Date joiningDate, Date endingDate, long advanceAmount) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.joiningDate = joiningDate;
		this.endingDate = endingDate;
		this.advanceAmount = advanceAmount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}


	public Date getEndingDate() {
		return endingDate;
	}


	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	
	public long getAdvanceAmount() {
		return advanceAmount;
	}
	
	
	public void setAdvanceAmount(long advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
}
