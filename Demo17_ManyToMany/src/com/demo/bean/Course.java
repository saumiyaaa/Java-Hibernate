package com.demo.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "corm2m")
public class Course {
	
	@Id
	@Column(length = 5)
	private int courseid;
	
	@Column(length = 20)
	private String coursename;
	
	@Column(length = 20)
	private String duration;
	
	@Column(length = 6)
	private double fees;
	
	@ManyToMany
	private Set<Student> students;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int courseid, String coursename, String duration, double fees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.duration = duration;
		this.fees = fees;
	}

	public Course(int courseid, String coursename, String duration, double fees, Set<Student> students) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.duration = duration;
		this.fees = fees;
		this.students = students;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", duration=" + duration + ", fees="
				+ fees + ", students=" + students + "]";
	}
	
	

}
