//5. Write a program to convert a binary number to a decimal number.
package com.assignmet.main;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        System.out.println("Enter binary number :");
        String binary = in.next();
		int decimal = Integer.parseInt(binary, 2);
		System.out.println(binary + " in binary = " + decimal + " in decimal.");
	}

}

