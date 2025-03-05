package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_anno")
public class Employee {
	
	@Column(length = 6)
	@Id
	private int empid;
	@Column (length = 15)
	private String ename;
	@Column (length = 6)
	private double esal;
	
	public Employee() {
		super();
	}
	
	public Employee(String ename, int empid, double esal) {
		super();
		this.ename = ename;
		this.empid = empid;
		this.esal = esal;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", empid=" + empid + ", esal=" + esal + "]";
	}
	
	

}
