package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OrdersManyto1")
public class Order {
	
	@Id
	@Column(length = 5)
	private int orderid;
	
	@Column(length = 6)
	private double ordercost;
	
	@Column(length = 10)
	private String orderdate;
	
	@ManyToOne
	private Customer customer;

	public Order() {
		// TODO Auto-generated constructor stub
	}


	public Order(int orderid, double ordercost, String orderdate, Customer customer) {
		super();
		this.orderid = orderid;
		this.ordercost = ordercost;
		this.orderdate = orderdate;
		this.customer = customer;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public double getOrdercost() {
		return ordercost;
	}

	public void setOrdercost(double ordercost) {
		this.ordercost = ordercost;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	
	

	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", ordercost=" + ordercost + ", orderdate=" + orderdate + ", customer="
				+ customer + "]";
	}


	
	
	

}
