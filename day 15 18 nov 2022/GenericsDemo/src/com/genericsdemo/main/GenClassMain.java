package com.genericsdemo.main;

import com.genericsdemo.generics.Student;

public class GenClassMain {

	public static void main(String[] args) {
	
		Student<String> s1 = new Student<>("first");
		System.out.print("s1");
		s1.showGrade();
		
		Student<Integer> s2 = new Student<>(2);
		System.out.print("s2");
		s2.showGrade();
		
		Student<Character> s3 = new Student<>('C');
		System.out.print("s3");
		s3.showGrade();
	}
}
