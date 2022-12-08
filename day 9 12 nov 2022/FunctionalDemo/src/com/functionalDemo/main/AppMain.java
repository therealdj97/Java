package com.functionalDemo.main;

import com.functionallDemo.interfaces.MathOp;

public class AppMain {
	public static void main(String args[]) {
		// lambda expression in long way
		MathOp ref = (int a ,int b) -> {
			return (a+b);
		};
		System.out.println("Addition is "+ref.calculate(5, 10));
		
		// lambda expression in short way 
		ref = (a,b) -> a-b;
		System.out.println("Differance between 5 and 10 is "+ref.calculate(15, 10));
	}
}
