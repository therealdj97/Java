package com.assignment12.main;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Runnable rd = () ->{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			for(int i=0;i<=num;i++) {
				for(int j=0;j<i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		};
		new Thread (rd).start();
	}
}
