//Create a Java program to overload an add function that can 
//add integer, float or
//double values and display the sum.
package com.Assignment6.main;

import com.Assignment6.Entity.add;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add s1 = new add();
		
		float a=s1.sum(0.10f, 0.4f);
		double b=s1.sum(10.2, 20.5);
		int c=s1.sum(4, 5);
		
		System.out.println("float addition is "+ a);
		System.out.println("double addition is "+ b);
		System.out.println("integer addition is "+ c);
		
	}

}
