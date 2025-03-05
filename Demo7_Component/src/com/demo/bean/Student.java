package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {
	
	@Id
	@Column(length = 3)
	private int rollNo;
	@Column(length = 15)
	private String studentName;
	@Column(length = 4)
	private float percentage;
	@Embedded
	private MyDate dob;
	@Embedded
	private Sport sport;	

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String studentName, float percentage, MyDate dob, Sport sport) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.percentage = percentage;
		this.dob = dob;
		this.sport = sport;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", percentage=" + percentage + ", dob="
				+ dob + ", sport=" + sport + "]";
	}
	
	

}
