//3. Given a square matrix of order ‘n’. Input the value for n and the positive integers in the matrix and
//perform the following tasks.
//a. Display the original matrix
//b. Print the row and column position of the largest element in the matrix
package com.assignment.main;
import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimention of square matrix");
		int n = sc.nextInt();
		System.out.println("ënter elements of array");
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			arr[i][j]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int max =arr[0][0];
		int r=0;
		int c=0;
		for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(arr[i][j]>max) {
				max=arr[i][j];
				r=i;
				c=j;
			}
		}
			
		}
		System.out.println("max element is at row "+r+" column "+c);
		}
}
