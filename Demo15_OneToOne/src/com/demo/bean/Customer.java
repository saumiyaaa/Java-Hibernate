package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cust1to1")
public class Customer {
	
	@Id
	@Column(length = 5)
	private int custid;
	
	@Column(length = 20)
	private String custname;
    
	@OneToOne
	private Order order;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, String custname, Order order) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.order = order;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", order=" + order + "]";
	}
	
	

}
