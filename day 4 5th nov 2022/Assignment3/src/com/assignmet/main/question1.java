//1. Write a program to find if a given year is leap year or not.
package com.assignmet.main;
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year");
		int year = sc.nextInt();
		
		if(year%4 == 0)
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
	}

}
