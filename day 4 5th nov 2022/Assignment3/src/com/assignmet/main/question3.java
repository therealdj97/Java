//3. Write a program to find the factorial of a number.
package com.assignmet.main;
import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = 	sc.nextInt();
		int sum = 1;
		for(int i=1;i<=num;i++)
			sum = sum*i;
		System.out.println("factorial is "+sum);
			
	}

}
