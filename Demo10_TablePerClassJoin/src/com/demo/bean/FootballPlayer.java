package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "FootballPlyrJoined")
@PrimaryKeyJoinColumn(name = "jersey_no")
public class FootballPlayer extends Player {
	@Column(length = 15)
    private String position; // Position in the game (e.g., Striker, Midfielder, Defender)

    public FootballPlayer() {
    	
    	position = "Striker";
    }
    
    // Constructor
    public FootballPlayer(int jersey_no,String name, int age, String team, String position) {
        super(jersey_no,name, age, team);
        this.position = position;
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
