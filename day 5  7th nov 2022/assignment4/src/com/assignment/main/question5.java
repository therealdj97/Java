//5. Create a class named Rectangle with data members length and breadth. Create methods for entering
//the details and displaying the details. Create two more methods, one for finding the area and another
//for finding the perimeter of the rectangle. Create an object for the class and invoke all the methods.
package com.assignment.main;

import com.assignment.entity.Rectangle;

public class question5 {

	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		r1.enterDetails();
		r1.area();
		r1.perimeter();
		r1.printDetails();
	}

}
