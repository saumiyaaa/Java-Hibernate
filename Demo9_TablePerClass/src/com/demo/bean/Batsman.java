package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BatsmanClass")
public class Batsman extends Cricketer {
	@Column(length = 3)
    private int runsScored;
	@Column(length = 3)
    private int centuries; 
    
    public Batsman() {
    	
    	runsScored = 76;
    	centuries = 100;
    }

    // Constructor
    public Batsman(int jersey_no,String name, int age, String team, int runsScored, int centuries) {
        super(jersey_no,name, age, team, "Batsman");
        this.runsScored = runsScored;
        this.centuries = centuries;
    }
    
    
    
 
    public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	@Override
    public String toString() {
        return super.toString() + ", Runs Scored: " + runsScored + ", Centuries: " + centuries;
    }


}
