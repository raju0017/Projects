package com.king.supercar.model.usermodel;

import java.util.Date;
import java.util.Set;

public class User {

	private int userid;
	private String username;
	private String password;
	private Date dob;
	private String gender;
	private Set<Address> addresses;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(int userid, String username, String password, Date dob, String gender, Set<Address> addresses) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.addresses = addresses;
	}



	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
}
