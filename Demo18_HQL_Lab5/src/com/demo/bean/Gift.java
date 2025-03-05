package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gifts")
public class Gift {
	
	@Id
	@Column(length = 5)
	private int giftId;
	@Column(length = 25)
	private String giftname;
	@Column(length = 25)
	private String category;
	@Column(length = 7)
	private float price;

	public Gift() {
		// TODO Auto-generated constructor stub
	}

	public Gift(int giftId, String giftname, String category, float price) {
		super();
		this.giftId = giftId;
		this.giftname = giftname;
		this.category = category;
		this.price = price;
	}

	public int getGiftId() {
		return giftId;
	}

	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}

	public String getGiftname() {
		return giftname;
	}

	public void setGiftname(String giftname) {
		this.giftname = giftname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Gift [giftId=" + giftId + ", giftname=" + giftname + ", category=" + category + ", price=" + price
				+ "]";
	}
	
	

}
