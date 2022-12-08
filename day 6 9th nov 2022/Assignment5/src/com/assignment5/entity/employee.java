package com.assignment5.entity;
import java.util.Scanner;
public class employee {
	private int empCode;
	private String name;
	private int basicPay;
	private double DA;
	private double HRA;
	private double grossPay;
	
	public  void employeeDetails() {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter EMployee code");
		empCode = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		name = sc.next();
		
		System.out.println("Enter EMployee BasicPay");
		basicPay =sc.nextInt();
	}
	public void grossPay() {
		if(basicPay<3500) {
			DA = basicPay*0.45;
			HRA = basicPay*0.20;
		}
		else if(basicPay>=3500) {
			DA = basicPay/2;
			HRA = 1000;
		}
		grossPay=basicPay+DA+HRA;
	}
	public void display() {
		System.out.println("emp name is "+name);
		System.out.println("emp code is "+empCode);
		System.out.println("DA is "+DA);
		System.out.println("HRA is "+HRA);
		System.out.println("basic Pay is "+basicPay);
		System.out.println("Gross Pay is "+grossPay);
	}
}
