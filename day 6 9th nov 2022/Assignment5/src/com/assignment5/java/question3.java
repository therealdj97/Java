//3. Create a class named Book with data members title, author and price. Write a parameterized
//constructor for the class. Write a function for displaying the details. Create two objects for the class
//using two constructors.

package com.assignment5.java;

import com.assignment5.entity.book;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b1 = new book();
		b1.bookDetails("Pscychology of Money", " Morgan Housel", 700.00);
		b1.display();
		
		book b2 = new book();
		b2.bookDetails("Almanak of naval ravikant", "naval ravikant", 500.00);
		b2.display();
	}

}
