package com.vscs.atyourhome.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employee")
public class EmployeeBPO {
	
	@Id
	@GeneratedValue
	@Column(name = "EMPID")
	private int emp_id;
	
	@Column(name = "EMPNAME")
	private String emp_name;
	
	@Column(name = "EMPAGE")
	private String age;
	
	@Column(name = "SALARY")
	private Integer salary;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "service")
	private String service;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}


}
