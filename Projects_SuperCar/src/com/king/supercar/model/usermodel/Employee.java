package com.king.supercar.model.usermodel;

import java.util.Date;

import com.king.supercar.model.places.Branch;

public class Employee extends User{

	private Date joindate;
	private String role;
	private Branch branch;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(Date joindate, String role, Branch branch) {
		super();
		this.joindate = joindate;
		this.role = role;
		this.branch = branch;
	}



	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
