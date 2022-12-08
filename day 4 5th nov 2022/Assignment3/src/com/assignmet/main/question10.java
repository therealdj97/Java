//10. Write a program to check whether a particular element is present in the array or not.
package com.assignmet.main;
import java.util.Scanner;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to be present in an array");
		int a = sc.nextInt();
		int arr3[] = new int[a];

		System.out.println("enter elements of array");
		for(int i=0;i<a;i++) {
			arr3[i]=sc.nextInt();
		}
		System.out.println("enter element to be searched in an array");
		int toCheckValue = sc.nextInt();
		
		boolean test = false;
		for (int element : arr3) {
			if (element == toCheckValue) {
					test = true;
					}
			}
		if(test==true)
			System.out.println("number is present in an array");
		else
			System.out.println("number is not present in an array");
		}
	}
