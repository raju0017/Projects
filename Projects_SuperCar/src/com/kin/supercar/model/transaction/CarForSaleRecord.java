package com.kin.supercar.model.transaction;

import java.util.Date;

import com.king.supercar.vechicle.Car;

public class CarForSaleRecord {

	private int carforsaleid;
	private Date dateofadded;
	private String branchlocation;
	private double saleprice;
	private int speedoreading;
	private Car car;
	
	
	public CarForSaleRecord() {
		// TODO Auto-generated constructor stub
	}

	
	public CarForSaleRecord(int carforsaleid, Date dateofadded, String branchlocation, double saleprice,
			int speedoreading, Car car) {
		super();
		this.carforsaleid = carforsaleid;
		this.dateofadded = dateofadded;
		this.branchlocation = branchlocation;
		this.saleprice = saleprice;
		this.speedoreading = speedoreading;
		this.car = car;
	}


	public int getCarforsaleid() {
		return carforsaleid;
	}

	public void setCarforsaleid(int carforsaleid) {
		this.carforsaleid = carforsaleid;
	}

	public Date getDateofadded() {
		return dateofadded;
	}

	public void setDateofadded(Date dateofadded) {
		this.dateofadded = dateofadded;
	}

	public String getBranchlocation() {
		return branchlocation;
	}

	public void setBranchlocation(String branchlocation) {
		this.branchlocation = branchlocation;
	}

	public double getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}

	public int getSpeedoreading() {
		return speedoreading;
	}

	public void setSpeedoreading(int speedoreading) {
		this.speedoreading = speedoreading;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
