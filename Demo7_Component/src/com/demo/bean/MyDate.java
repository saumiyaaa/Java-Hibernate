package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MyDate {
	
	@Column(length = 2)
	private int day;
	@Column(length = 2)
	private int month;
	@Column(length = 4)
	private int year;

	public MyDate() {
		// TODO Auto-generated constructor stub
	}


	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
	

}
