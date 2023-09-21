package com.app.springboot.main.entity;

import java.util.Date;

public class DateRangeSearchRequest {
	
	private Date start_date;
    private Date endDate;
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    
}
