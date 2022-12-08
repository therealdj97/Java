//3. Create a class named Book with data members title, author and price. Write a parameterized
//constructor for the class. Write a function for displaying the details. Create two objects for the class
//using two constructors.
package com.assignment5.entity;

public class book {
	
	private String title;
	private String author;
	private Double price;
	
	public void bookDetails(String title, String author, Double price) {

		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void display() {
		System.out.println("title: "+title+" author: "+author+" price: "+price);
}
}
