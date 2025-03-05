package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
	
	@Id
	@Column(length = 5)
	private int custId;
	@Column(length = 15)
	private String firstName;
	@Column(length = 15)
	private String lastName;
	@Column(length = 7)
	private float annualSal;
	@Column(length = 25)
	private String city;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String firstName, String lastName, float annualSal, String city) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSal = annualSal;
		this.city = city;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getAnnualSal() {
		return annualSal;
	}

	public void setAnnualSal(float annualSal) {
		this.annualSal = annualSal;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", annualSal="
				+ annualSal + ", city=" + city + "]";
	}
	
	

}
