package com.Assignments8.main;

import com.Assignment8.interfaces.Average;
import com.Assignment8.interfaces.Sum;

public class AppMainQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum  s1 = new Sum();
		Average avg1 = new Average();
		int a=s1.process(5, 10);
		float b=avg1.process(2, 3);
		System.out.println("Addition of 5 & 10 is "+a);
		System.out.println("Average of 2 & 3 is "+b);
		
	}

}
