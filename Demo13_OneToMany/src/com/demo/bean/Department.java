package com.demo.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept_1_to_many")
public class Department {
	
	@Id
	@Column(length = 5)
	private int deptID;
	
	@Column(length = 15)
	private String deptName;
	
	@OneToMany(mappedBy = "dept")
	Set<Employee> employees; 

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptID, String deptName, Set<Employee> employees) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
		this.employees = employees;
	}

	public Department(int deptID, String deptName) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + ", employees=" + employees + "]";
	}
	
	

}
