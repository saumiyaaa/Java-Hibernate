package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Sport {
	
	@Column(length = 15)
	private String sportsName;
	@Column(length = 10)
	private String sportType;
	@Column(length = 20)
	private int playerCount;

	public Sport() {
		// TODO Auto-generated constructor stub
	}

	public Sport(String sportsName, String sportType, int playerCount) {
		super();
		this.sportsName = sportsName;
		this.sportType = sportType;
		this.playerCount = playerCount;
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

	public String getSportType() {
		return sportType;
	}

	public void setSportType(String sportType) {
		this.sportType = sportType;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	@Override
	public String toString() {
		return "Sport [sportsName=" + sportsName + ", sportType=" + sportType + ", playerCount=" + playerCount + "]";
	}
	
	

}
