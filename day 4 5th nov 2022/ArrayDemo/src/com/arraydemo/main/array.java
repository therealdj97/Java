package com.arraydemo.main;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[4];
		//here arr1 is reference 
		int[] arr2 = new int[4];
		int arr3[]= {10,20,30,40,50};
		int [] arr4 = new int[] {70,80,90};
		arr3 = arr4;
		for (int i=0;i<=arr3.length;i++) {
			System.out.println(arr3[i]);
		}

	}

}

