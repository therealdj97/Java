//3. Create a class which has 2 integer instance variables and getter and setter methods.
//Create a subclass which has functions to find the sum, difference and product of these
//instance variables and print the result. Create instance of subclass and invoke all the
//functions in main.
package com.Assignment6.main;

import com.Assignment6.Entity.calc;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c1 = new calc();
		c1.setA(5);
		c1.setB(5);
		
		calc c2 = new calc();
		c2.setA(15);
		c2.setB(5);
		System.out.println("sum is "+c1.sum());
		System.out.println("multiplication is "+c1.mult());
		System.out.println("differance is "+c1.diff());
		System.out.println("sum is "+c2.sum());
		System.out.println("multiplication is "+c2.mult());
		System.out.println("differance is "+c2.diff());
	}

}
