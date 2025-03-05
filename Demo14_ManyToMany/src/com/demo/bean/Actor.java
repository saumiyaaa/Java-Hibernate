package com.demo.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "actm2m")
public class Actor {
	
	@Id
	@Column(length = 5)
	private  int actorid;
	
	@Column(length = 15)
	private String actorname;
	
	@ManyToMany
	private Set<Movie> movies;
	
	public Actor() {
		super();
	}
	
	public Actor(int actorid, String actorname, Set<Movie> movies) {
		super();
		this.actorid = actorid;
		this.actorname = actorname;
		this.movies = movies;
	}
	
	public Actor(int actorid, String actorname) {
		super();
		this.actorid = actorid;
		this.actorname = actorname;
	}

	public int getActorid() {
		return actorid;
	}

	public String getActorname() {
		return actorname;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setActorid(int actorid) {
		this.actorid = actorid;
	}

	public void setActorname(String actorname) {
		this.actorname = actorname;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Actor [actorid=" + actorid + ", actorname=" + actorname + ", movies=" + movies + "]";
	}
	
	
	

}