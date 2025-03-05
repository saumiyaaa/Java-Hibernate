package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Pl_er_heir")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", length = 25)
@DiscriminatorValue(value = "pl")

public class Player {

	@Id
	@Column(length = 3)
	protected int jersey_no;
	@Column(length = 25)
	 protected String name, team;
	@Column(length = 2)
	  protected int age;
	  
	  public Player(){
		  
	    jersey_no = 10;
	    name = "Sam";
	    age = 21;
	    team = "A"; 
	  }
	  
	   public Player(int j, String n, int a, String t) {
		   jersey_no = j;
	        name = n;
	        age = a;
	        team = t;
	    }
	   
	   
	   
	   public int getJersey_no() {
		return jersey_no;
	}

	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	   public String toString() {
	       return "Jersey No: "+jersey_no+"Name: " + name + ", Age: " + age + ", Team: " + team;
	   }


}
