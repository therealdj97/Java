//2. Create a class Student with rollno, name, age and totalmark as instance variables and
//methods get(), disp(), findgrade(). If total mark is greater than 900 grade A,greater than
//700 grade B, greater than 500 grade C else failed. Create a subclass ProjectStudent from
//the Student class with the data members projid, projtitle, company, projgrade with
//methods getPDetails(), dispPDetails(). Create instance of Project Student and invoke all
//the methods in main.
//(Do the program without using constructors)
package com.Assignment6.Entity;
import java.util.Scanner;
public class student {
	private int rollno;
	private String name;
	private int age;
	private int totalmark;
	
	public void get(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno of student");
		rollno = sc.nextInt();
		System.out.println("Enter name of student");
		name = sc.next();
		System.out.println("Enter age of student");
		age = sc.nextInt();
		System.out.println("Enter totalmark of student");
		totalmark = sc.nextInt();
		
		}
	
	public void disp() {
		System.out.println("Details of student are");
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(age);
		System.out.println(totalmark);
		}
	
	public void findgrade(){
		if (totalmark>900) {
			System.out.println("GRADE A");
		}
		else if(totalmark>700) {
			System.out.println("GRADE B");
		}
		else if(totalmark>500) {
			System.out.println("GRADE C");
		}
		else 
			System.out.println("FAILED");
		}
	}
