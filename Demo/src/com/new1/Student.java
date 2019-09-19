package com.new1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studenttable")

public class Student {

	@Id
	@Column(name="roll_no")
	private int roll_no;
	@Column(name="name")
	private String name;
	@Column(name="mark")
	private int mark;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Student(int roll_no, String name, int mark) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.mark = mark;
	}
	
	

}
