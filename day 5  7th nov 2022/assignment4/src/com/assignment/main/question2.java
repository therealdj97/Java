//2. Write a program to find the transpose of a given matrix.
package com.assignment.main;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length for column");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt(); 
		System.out.println("Enter length for rows");
		int b =sc.nextInt();
		int arr1[][]=new int[a][b];
		
		System.out.println("Enter elements for 1st array");
		for (int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr1[i][j]=sc.nextInt();	
			}	
		}
		
		int row=arr1.length;
		int col=arr1[0].length;
		int arr2[][]= new int[col][row];
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr2[j][i]=arr1[i][j];
				}
			}
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			
			System.out.println(" ");
		}		
	}

}
