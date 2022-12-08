package com.collectiondemo.main;

import java.util.TreeSet;

import com.collectiondemo.comparator.IdComparator;
import com.collectiondemo.comparator.NameComparator;
import com.collectiondemo.pojo.Employee;
import com.collectiondemo.pojo.Student;

public class SortingMain {

	public static void main(String[] args) {
	
		TreeSet<Student> tset = new TreeSet<>();
		
		Student s1 = new Student(31, "Vaibhav");
		Student s2 = new Student(32, "Sushant");
		Student s3 = new Student(33, "Anil");
		
		tset.add(s1);
		tset.add(s2);
		tset.add(s3);
		
		System.out.println("All students from tset are :- ");
		tset.forEach(System.out::println);
		
		
		Employee e1 = new Employee(1233, "XYZ");
		Employee e2 = new Employee(1235, "LMN");
		Employee e3 = new Employee(1234, "ABC");
		
//		TreeSet<Employee> eset = new TreeSet<>(
//				(r1,r2) -> r1.getEmpName().compareTo(r2.getEmpName()));

		TreeSet<Employee> eset = new TreeSet<>(new IdComparator());

		eset.add(e1);
		eset.add(e2);
		eset.add(e3);
		
		System.out.println("All employees from eset are : ");
		eset.forEach(System.out::println);
	}
}






