//3. Create a class which has 2 integer instance variables and getter and setter methods.
//Create a subclass which has functions to find the sum, difference and product of these
//instance variables and print the result. Create instance of subclass and invoke all the
//functions in main.
package com.Assignment6.Entity;

public class calc extends three{
	public int sum(){
		int c = this.getA()+ this.getB();
		return c;
	}	
	public int diff() {
		int c = this.getA()- this.getB();
		return c;
	}
	
	public int mult() {
		int c = this.getA()* this.getB();
		return c;
	}
}
