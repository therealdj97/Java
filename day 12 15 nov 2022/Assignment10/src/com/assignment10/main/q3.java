package com.assignment10.main;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try {	
			System.out.println("enter a string");
			String s1 = sc.nextLine();
			int s2 = Integer.parseInt(s1);
			System.out.println("String converted to integer is "+s2);
		}
		catch(NumberFormatException exc){
			System.out.println("You have entered a character.Please Enter a number only.");
		}		
	}

}
