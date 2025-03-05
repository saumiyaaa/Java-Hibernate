package com.demo.bean;

public class Employee {
	
	private String ename;
	private int empid;
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
