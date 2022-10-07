package com.packageName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class MyPOJO {

	@Id
	@Column(name = "roll_num")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll_num;

	@Column(name = "name")
	private String name;

	@Column(name = "standard")
	private String standard;

	@Column(name = "grade")
	private char grade;

	@Column(name = "school")
	private String school;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getRoll_num() {
		return roll_num;
	}
	void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	
	String getStandard() {
		return standard;
	}
	void setStandard(String standard) {
		this.standard = standard;
	}
	
	char getGrade() {
		return grade;
	}
	void setGrade(char grade) {
		this.grade = grade;
	}
	
	String getSchool() {
		return school;
	}
	void setSchool(String school) {
		this.school = school;
	}
}