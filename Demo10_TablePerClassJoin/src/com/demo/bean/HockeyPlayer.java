package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "HockeyPlyrJoined")
@PrimaryKeyJoinColumn(name = "jersey_no")
public class HockeyPlayer extends Player {
	@Column(length = 15)
    private String position; 
    
    public HockeyPlayer() {
    	
    	super();
    	position = "Forward"; 
    }
    
    public HockeyPlayer(int jersey_no,String name, int age, String team, String pos) {
        super(jersey_no,name, age, team);
        position = pos;
    }
    
    
    
    public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
    public String toString() {
        return super.toString() + ", Position: " + position;
    }


}
