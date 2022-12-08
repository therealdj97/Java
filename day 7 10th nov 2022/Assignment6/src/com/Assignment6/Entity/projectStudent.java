//2. Create a class Student with rollno, name, age and totalmark as instance variables and
//methods get(), disp(), findgrade(). If total mark is greater than 900 grade A, greater than
//700 grade B, greater than 500 grade C else failed. Create a subclass ProjectStudent from
//the Student class with the data members projid, projtitle, company, projgrade with
//methods getPDetails(), dispPDetails(). Create instance of Project Student and invoke all
//the methods in main.
//(Do the program without using constructors)

package com.Assignment6.Entity;
import java.util.Scanner;
public class projectStudent extends student{
	private int projid ;
	private String projtitle;
	private String company;
	private int projgrade;
	
	public void  getPDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter project id of student");
		projid = sc.nextInt();
		System.out.println("Enter project title of student");
		projtitle = sc.next();
		System.out.println("Enter company of student");
		company = sc.next();
		System.out.println("Enter project grade of student");
		projgrade = sc.nextInt();
		
	} 
	public void dispPDetails() {
		System.out.println("Details of project  student are");
		System.out.println("project id "+projid);
		System.out.println("project title "+projtitle);
		System.out.println("company name "+company);
		System.out.println("project grade "+projgrade);
	}
}
