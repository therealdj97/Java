package com.genericsdemo.generics;

public class Student<T> {

	private T grade;

	public Student(T grade) {
		this.grade = grade;
	}
	
	public void showGrade() {
		System.out.println(" scored grade : " + grade);
	}
}
