package com.oopDemo.main;

import com.oopDemo.entity.abc;

public class overLoadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc obj = new abc();
		obj.show();
		obj.show(10, 20);
		obj.show("hi", "hello");
	}

}
