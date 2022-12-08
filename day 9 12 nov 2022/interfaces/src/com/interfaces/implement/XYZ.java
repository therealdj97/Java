package com.interfaces.implement;

import com.interfaces.interfaces.ABC;

public class XYZ implements ABC{

	@Override
	public void show() {
		System.out.println("show() of XYZ called");
	}
	
	@Override
	public void display() {
		System.out.println("display() of XYZ called");
	}

}
