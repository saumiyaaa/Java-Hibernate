package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Cricketer")
public class Cricketer extends Player {
	@Column(length = 15)
	 private String role; 
	    
	    public Cricketer(){
	    	
	    	super();
	    	role = "Batsman";
	    }
	    // Constructor
	    public Cricketer(int jersey_no,String name, int age, String team, String r) {
	        super(jersey_no,name, age, team);
	        role = r;
	    }
	    
	    
	    
	    public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		// toString method to display Cricketer details
	    @Override
	    public String toString() {
	        return super.toString() + ", Role: " + role;
	    }


}
