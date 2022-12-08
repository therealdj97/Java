package com.assignment13.pojo;

import java.util.Objects;

public class Student {
	private String name;
	private String grade;
	
	
	public Student() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public Student(String name, String grade) {
	this.name=name;
	this.grade=grade;
	}
	
	@Override
	public String toString() {
		return "name= "+ name + ", grade=" + grade ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(getGrade(), name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return grade == other.grade && Objects.equals(name, other.name);
	}
}
