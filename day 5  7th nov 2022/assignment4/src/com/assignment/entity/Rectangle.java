//5. Create a class named Rectangle with data members length and breadth. Create methods for entering
//the details and displaying the details. Create two more methods, one for finding the area and another
//for finding the perimeter of the rectangle. Create an object for the class and invoke all the methods.

package com.assignment.entity;
import java.util.Scanner;

public class Rectangle {
	
		
		int length; 
		int breadth;
		int area;
		int perimeter;
	
	
	public void enterDetails() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length of Rectangle ");
		length = sc.nextInt();
		System.out.println("Enter bredth of Rectangle ");
		breadth = sc.nextInt();
	}

	public void area() {
		area = length*breadth;
	}
	public void perimeter() {
		perimeter = 2*(length+breadth);
	}
	public void printDetails() {
		System.out.println("area "+area);
		System.out.println("perimeter "+perimeter);
	}
}
