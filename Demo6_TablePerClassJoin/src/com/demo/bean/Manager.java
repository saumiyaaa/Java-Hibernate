package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ManClassJoined")
@PrimaryKeyJoinColumn(name = "empid")
public class Manager extends Employee {

	@Column (length = 6)
	private float incentives;
	@Column(length = 10)
	private int no_of_sub;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int empid, String name, double salary, float incentives, int no_of_sub) {
		super(empid, name, salary);
		// TODO Auto-generated constructor stub
		this.incentives = incentives;
		this.no_of_sub = no_of_sub;
	}

	public float getIncentives() {
		return incentives;
	}

	public void setIncentives(float incentives) {
		this.incentives = incentives;
	}

	public int getNo_of_sub() {
		return no_of_sub;
	}

	public void setNo_of_sub(int no_of_sub) {
		this.no_of_sub = no_of_sub;
	}

	@Override
	public String toString() {
		return "Manager [incentives=" + incentives + ", no_of_sub=" + no_of_sub + ", toString()=" + super.toString()
				+ "]";
	}

	

}
