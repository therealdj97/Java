package com.genericsdemo.implementer;

import com.genericsdemo.generics.PQR;

public class Implementer2 implements PQR<String> {

	@Override
	public void show(String param) {
		System.out.println("show() called with paramater : " + param);
	}
}
