package com.assignment11.entity;
import java.util.Scanner;

public class Q4A implements Runnable{
@Override
public void run() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int x = sc.nextInt();
	int temp=0;
	try {
		for(int i =1;i<=x;i++) {
			temp=temp+i;
			Thread.sleep(2500);
			System.out.println("Sum of natural number is "+temp);
		}
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
}
}
