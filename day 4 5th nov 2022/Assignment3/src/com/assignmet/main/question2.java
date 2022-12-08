//2. Write a program to check whether a given number is prime or not.
package com.assignmet.main;
import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;++i) {
			if(num%i == 0) {
				flag=false;
				break;
				}
			else
				flag = true;
		}
			
		if(flag==true)
			System.out.println("number is prime");
		else
			System.out.println("number isn't prime");
		}
	}
