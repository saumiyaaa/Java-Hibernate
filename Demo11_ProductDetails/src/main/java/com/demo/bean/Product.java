package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@Column(length = 5)
	private int prodid;
	@Column(length = 25)
	private String prodname;
	@Column(length = 5)
	private int prodqty;
	@Column(length = 6)
	private double prodprice;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int prodid, String prodname, int prodqty, double prodprice) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodqty = prodqty;
		this.prodprice = prodprice;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public int getProdqty() {
		return prodqty;
	}

	public void setProdqty(int prodqty) {
		this.prodqty = prodqty;
	}

	public double getProdprice() {
		return prodprice;
	}

	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}

	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", prodqty=" + prodqty + ", prodprice="
				+ prodprice + "]";
	}
	
	

}
