package com.genericsdemo.main;

import com.genericsdemo.generics.ABC;

public class GenMethodMain {

	public static void main(String[] args) {

		ABC obj = new ABC();
		obj.show(123);
		obj.show("hi");
		obj.show(3.4);
		
		obj.print(12, "hello");
		obj.print("hi", 3.4);
	}
}
