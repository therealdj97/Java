package com.assignment10.main;
import java.util.InputMismatchException;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
				System.out.println("Enter a number to be squared");
				int a = sc.nextInt();
				int b = a*a;
				System.out.println("Square of "+a+" is "+b);
		}
		catch( InputMismatchException exc){
			System.out.println("You have entered a character.Please Enter a number only.");
		}		

	}

}
