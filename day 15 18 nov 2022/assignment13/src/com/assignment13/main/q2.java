package com.assignment13.main;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class q2 {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		int a;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter operation to be performed  1 to add, 2 to add first ,3 to add last: ");
			 a = sc.nextInt();
		
		switch(a) {
		
		case 1:
				System.out.println("Enter integer to be added in list : ");
				int x = sc.nextInt();
				l1.add(x);
				System.out.println("All elemets are ");
				l1.forEach(System.out::println);
			break;
		case 2:
				System.out.println("Enter integer to be added First in list : ");
				int y = sc.nextInt();
				l1.addFirst(y);
				System.out.println("All elemets are ");
				l1.forEach(System.out::println);
			break;
		case 3:
				System.out.println("Enter integer to be added Last in list : ");
				int z = sc.nextInt();
				l1.addLast(z);
				System.out.println("All elemets are ");
				l1.forEach(System.out::println);
			break;
		case 4:
			System.out.println("Enter integer to be removed from list");
			int z1 = sc.nextInt();
			l1.remove(z1);
			System.out.println("All elemets are ");
			l1.forEach(System.out::println);
			break;
		default:
			System.out.println("Enter a valid input");
		}
			System.out.println("Enter 1 to continue ");
			a = sc.nextInt();
		}
		while(a == 1);
		}
	}
