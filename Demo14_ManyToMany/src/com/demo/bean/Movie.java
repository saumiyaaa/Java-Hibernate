package com.demo.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movm2m")
public class Movie {
	
	@Id
	@Column(length = 5)
	private int movieid;
	
	@Column(length = 15)
	private String moviename;
	
	@ManyToMany(mappedBy = "movies")
	private Set<Actor> actors;
	
	public Movie() {
		super();
		
	}
	

	public Movie(int movieid, String moviename, Set<Actor> actors) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.actors = actors;
	}
	
	public Movie(int movieid, String moviename) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
	}


	public int getMovieid() {
		return movieid;
	}


	public String getMoviename() {
		return moviename;
	}


	public Set<Actor> getActors () {
		return actors;
	}


	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}


	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", Actor=" + actors + "]";
	}
	
	

}