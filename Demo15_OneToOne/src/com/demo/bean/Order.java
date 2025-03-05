package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Orders1to1")
public class Order {
	
	@Id
	@Column(length = 5)
	private int orderid;
	
	@Column(length = 6)
	private double ordercost;
	
	@Column(length = 10)
	private String orderdate;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int orderid, double ordercost, String orderdate) {
		super();
		this.orderid = orderid;
		this.ordercost = ordercost;
		this.orderdate = orderdate;
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

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", ordercost=" + ordercost + ", orderdate=" + orderdate + "]";
	}
	
	

}
