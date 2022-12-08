package com.assignment13.main;

import java.util.TreeSet;

import com.assignment13.pojo.Student;

public class q4 {

	public static void main(String[] args) {
		TreeSet<Student> tset = new TreeSet<>((t1,t2)->t1.getGrade().compareTo(t2.getGrade()));
		Student s1 = new Student("Dhiraj","A");
		Student s2 = new Student("Abhi","B");
		Student s3 = new Student("Rajan","C");
		Student s4 = new Student("PunWesh","D");
		tset.add(s1);
		tset.add(s2);
		tset.add(s3);
		tset.add(s4);
		System.out.println("All student from Tree Set are :");
		tset.forEach(System.out::println);
	}
}
