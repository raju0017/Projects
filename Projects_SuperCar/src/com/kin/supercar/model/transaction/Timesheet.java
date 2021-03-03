package com.kin.supercar.model.transaction;

import java.util.Date;

public class Timesheet 
{
	private int timesheetid;
	private Date frotime;
	private Date totime;
	private Date frodate;
	private Date todate;
	
	public Timesheet() {
		// TODO Auto-generated constructor stub
	}

	public Timesheet(int timesheetid, Date frotime, Date totime, Date frodate, Date todate) {
		super();
		this.timesheetid = timesheetid;
		this.frotime = frotime;
		this.totime = totime;
		this.frodate = frodate;
		this.todate = todate;
	}

	public int getTimesheetid() {
		return timesheetid;
	}

	public void setTimesheetid(int timesheetid) {
		this.timesheetid = timesheetid;
	}

	public Date getFrotime() {
		return frotime;
	}

	public void setFrotime(Date frotime) {
		this.frotime = frotime;
	}

	public Date getTotime() {
		return totime;
	}

	public void setTotime(Date totime) {
		this.totime = totime;
	}

	public Date getFrodate() {
		return frodate;
	}

	public void setFrodate(Date frodate) {
		this.frodate = frodate;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}
	
	
	 

}
