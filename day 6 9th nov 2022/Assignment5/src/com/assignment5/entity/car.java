//4. Create a class named Car with a default constructor which initializes the instance variable
//model with the value “Ford”. Write a parametrized constructor also to initialize model.
//Write a getModel() method to print the value of model. Create two objects for the class
//using two constructors and invoke the getModel()method.
package com.assignment5.entity;

public class car {
	private String model ;
	
	public car() {
		model ="Ford";
		
	}
	public car(String model) {
		this.model = model;
	}
	
	public void getModel() {
		System.out.println("Model name of car is : "+model);
	}
	
}
