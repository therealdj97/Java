package com.objectdemo.pojo;

import java.util.Objects;

public class Student {
	
	int rollno ;
	String name ;
	
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	

	public void setName(String name) {
		this.name = name;
	}
	//number of parameter type of parameter must be the same while method overriding
	@Override
	public String toString() {
		return rollno+":"+name ;
	}
	@Override
	 public boolean equals(Object obj) { // upcasting
		Student ref = (Student) obj; // Downcasting
        return this.rollno == ref.rollno;
    }
	
	
	
	
}
