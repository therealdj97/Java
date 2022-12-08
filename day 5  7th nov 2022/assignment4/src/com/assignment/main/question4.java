//4. Define a class Student with data members rollno, name, mark1, mark2, mark3, total, avg. Use
//appropriate methods for entering the details and displaying the details. Also define a method for
//calculating the total mark and average. Create an object for the class and invoke all the methods.
package com.assignment.main;

import com.assignment.entity.student;

public class question4 {
	public static void main(String args[]) {
		student s1 = new student();
		s1.enterDetails();
		s1.total();
		s1.avg();
		s1.printdetails();
	}
}
