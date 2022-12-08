//8. Write a Java program to print the multiplication table of a given number.

package com.assignmet.main;
import java.util.Scanner;

public class question8 {
	public static void main(String args[]) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i =1;
		int b =0;
		for (i=1;i<21;i++) {
			b=i*a;
			System.out.println(b);
		}
		
		
	}
}
