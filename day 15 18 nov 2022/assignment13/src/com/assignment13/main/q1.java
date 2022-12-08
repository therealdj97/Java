package com.assignment13.main;

public class q1 {
	
	private static  <T> void display(T[] elements) {
		for (T  element : elements) {
			System.out.println("Elements are "+element);
		}
		System.out.println();	
	}

	public static void main(String[] args) {
		
		Integer[] intarr = {10,20,30};
		Double[] dbarr = {12.5,14.2,13.6,17.8};
		String[] strarr = {"Dhiraj","abhi","punwesh"};
		
		String elements;
		System.out.println("Int ");
		display(intarr);
		System.out.println("Double ");
		display(dbarr);
		System.out.println("String ");
		display(strarr);
	}

}
