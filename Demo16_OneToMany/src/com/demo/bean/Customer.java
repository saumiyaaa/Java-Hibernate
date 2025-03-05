package com.demo.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Cust1toMany")
public class Customer {
	
	@Id
	@Column(length = 5)
	private int custid;
	
	@Column(length = 20)
	private String custname;
    
	@OneToMany(mappedBy = "customer")
	private Set<Order> order;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, String custname, Set<Order> order) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.order = order;
	}
	
	

	public Customer(int custid, String custname) {
		super();
		this.custid = custid;
		this.custname = custname;
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

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", order=" + order + "]";
	}
	
	

}
