package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(length = 15)
	private String city; 
	@Column(length = 15)
	private String colony;
	@Column(length = 6)
    private int pinCode; 
	@Column (length = 5)
    private int houseno;
    
    public Address() {
    	
    	city = "Pune";
    	colony = "Hill View";
    	pinCode = 411058;
    	houseno = 11111;
    }
    
 public Address(int houseno, String colony, int pinCode,String city) {
    	
    	this.city = city;
    	this.colony = colony;
    	this.pinCode = pinCode;
    	this.houseno = houseno;
    }
 
 
 
 public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getColony() {
	return colony;
}

public void setColony(String colony) {
	this.colony = colony;
}

public int getPinCode() {
	return pinCode;
}

public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}

public int getHouseno() {
	return houseno;
}

public void setHouseno(int houseno) {
	this.houseno = houseno;
}

@Override
public String toString() {
	return "Address [city=" + city + ", colony=" + colony + ", pinCode=" + pinCode + ", houseno=" + houseno + "]";
}


 



}
