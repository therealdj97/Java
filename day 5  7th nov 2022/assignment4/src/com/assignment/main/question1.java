//1. Write a program to concatenate two arrays.
package com.assignment.main;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st arrray
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of first array");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter elements of 1st array");
		
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(int element : arr) {
			System.out.println(element);
		}
		// 2nd arrray
		System.out.println("enter lenght of second array");
		int b = sc.nextInt();
		int arr2[]=new int[b];
		System.out.println("Enter elements of 2nd array");
		for(int j=0;j<b;j++) {
			arr2[j]=sc.nextInt();
		}
		for (int elem : arr2) {
			System.out.println(elem);
		}
		
		// Concatenating an array
		int c = arr.length;
		int d = arr2.length;
		int e = c + d;
		int arr3[] = new int[e];
		int f = 0;
		
		for(int elem1 : arr) {
			arr3[f] = elem1;
			f++;
		}
		
//		for(int j=0;j<e;j=j+1) {
//			arr3[j]=arr[j];
//		}
		
		
		for(int elem2 : arr2) {
			arr3[f] = elem2;
			f++;
		}
		for (int abc : arr3) {
			System.out.print(abc + " ");
		}
		
	}

}
