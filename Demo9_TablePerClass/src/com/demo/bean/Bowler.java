package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BowlerClass")
public class Bowler extends Cricketer {
	@Column(length = 3)
	 private int wicketsTaken;
	@Column(length = 3)
	 private double bowlingAverage; 
	 
	 public Bowler() {
		 
		 wicketsTaken = 3;
		 bowlingAverage = 20.21;
	 }

	 // Constructor
	 public Bowler(int jersey_no,String name, int age, String team, int wicketsTaken, double bowlingAverage) {
	     super(jersey_no,name, age, team, "Bowler");
	     this.wicketsTaken = wicketsTaken;
	     this.bowlingAverage = bowlingAverage;
	 }
	 

	 @Override
	 public String toString() {
	     return super.toString() + ", Wickets Taken: " + wicketsTaken + ", Bowling Average: " + bowlingAverage;
	 }


}
