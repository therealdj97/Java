package com.genericsdemo.generics;

public class ABC {
	
	public <T> void show(T param)	//generic method 
	{
		System.out.println("show() called with parameter : " + param);
	}
	
	public <T,U> void print(T param1, U param2)	//generic method 
	{
		System.out.println("print() called with parameters : " + param1 + 
				" , " + param2);
	}
}

/*
	public void show(Object param) {
		System.out.println("show() called with parameter : " + param);
	}
*/