//6. Write a program to print Right Triangle Star Pattern where number of rows is given as input.
//*
//* *
//* * *
//* * * *
//* * * * *
package com.assignmet.main;
import java.util.Scanner;


public class question6 {
	public static void main(String[] args)	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to be printed");
		int num = sc.nextInt();
		int i,j;
		for(i=1;i<=num;i++)
		{
		for(j=0;j<i;j++){
		System.out.print("*");	
		}
		System.out.println();
		}
	}
}
