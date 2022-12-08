package com.assignment13.generics;

public class gen1 <T>{
	private T data;
	
	public gen1(T data) {
		this.data = data;
	}
	
	public void showData() {
		System.out.println("entered data is "+data);
	}
}
