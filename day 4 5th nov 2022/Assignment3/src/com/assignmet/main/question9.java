//9. Write a program to store some numbers in an array and find the largest one among them
package com.assignmet.main;
import java.util.Scanner;
public class question9 {
	public static void main(String args[]) { 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter lenght of an array");
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		System.out.println("Enter elements of an arrray");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		
		for (int element : arr) {
			if(element > max) {
			max = element;
			}
			else
				continue;
		}				
			
	System.out.println("largest number is " + max);
	} 
}

