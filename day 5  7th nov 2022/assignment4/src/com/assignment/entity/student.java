//4. Define a class Student with data members rollno, name, mark1, mark2, mark3, total, avg. Use
//appropriate methods for entering the details and displaying the details. Also define a method for
//calculating the total mark and average. Create an object for the class and invoke all the methods.

package com.assignment.entity;

import java.util.Scanner;
public class student {
	private int rollno;
	private String name;
	private int mark1;
	private int mark2;
	private int mark3;
	private int total;
	private double avg;
	
	public void enterDetails() {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("enter name");
		name = sc.nextLine();

		System.out.println("enter rollno");
		rollno = sc.nextInt();
		System.out.println("enter mark1");
		mark1 = sc.nextInt();
				
		System.out.println("enter mark2");
		mark2 = sc.nextInt();
		System.out.println("enter mark3");
		mark3 = sc.nextInt();
		
	}
	
	public void total(){
		 total = mark1+mark2+mark3;
		
	}	
	
	public void avg()
	{
		 avg = total/3;
	}	
	public void printdetails (){
		System.out.println("total mark of student is "+ total);
		System.out.println("average mark of student is "+ avg);
	}
}


