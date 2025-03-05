package com.demo.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "studm2m")
public class Student {
	
	@Id
	@Column(length = 5)
	private int studid;
	
	@Column(length = 15)
	private String studname;
	
	@Column(length = 25)
	private String email;
	
	@ManyToMany(mappedBy = "students")
	private Set<Course> courses;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studid, String studname, String email) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.email = email;
	}

	public Student(int studid, String studname, String email, Set<Course> courses) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.email = email;
		this.courses = courses;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + ", email=" + email + ", courses=" + courses
				+ "]";
	}
	
	

}
