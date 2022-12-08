package com.genericsdemo.implementer;

import com.genericsdemo.generics.PQR;

public class Implementer3 implements PQR {

	@Override
	public void show(Object param) {
		System.out.println("show() called with paramater : " + param);
	}
}
