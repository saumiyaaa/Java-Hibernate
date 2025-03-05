package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp_many_to_one")
public class Employee {
	
	@Id
	@Column(length = 5)
	private int empid;
	@Column(length = 15)
	private String name;
	@Column(length = 8)
	private double salary;
	@ManyToOne
	private Department dept;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String name, double salary, Department dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	

}
