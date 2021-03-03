package com.kin.supercar.model.transaction;

import java.util.Date;

import com.kin.supercar.model.pament.Payment;
import com.king.supercar.model.usermodel.User;

public class CarSellingRecord {

	private int carsaleid;
	private User user;
	private Payment pament;
	private Date dateofsale;
	private CarForSaleRecord carFopSaleRecord;
	
	public CarSellingRecord() {

	}
	
	public CarSellingRecord(int carsaleid, User user, Payment pament, Date dateofsale,
			CarForSaleRecord carFopSaleRecord) {
		super();
		this.carsaleid = carsaleid;
		this.user = user;
		this.pament = pament;
		this.dateofsale = dateofsale;
		this.carFopSaleRecord = carFopSaleRecord;
	}



	public int getCarsaleid() {
		return carsaleid;
	}
	public void setCarsaleid(int carsaleid) {
		this.carsaleid = carsaleid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Payment getPament() {
		return pament;
	}
	public void setPament(Payment pament) {
		this.pament = pament;
	}
	public Date getDateofsale() {
		return dateofsale;
	}
	public void setDateofsale(Date dateofsale) {
		this.dateofsale = dateofsale;
	}
	public CarForSaleRecord getCarFopSaleRecord() {
		return carFopSaleRecord;
	}
	public void setCarFopSaleRecord(CarForSaleRecord carFopSaleRecord) {
		this.carFopSaleRecord = carFopSaleRecord;
	}
}
