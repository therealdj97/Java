package com.genericsdemo.implementer;

import com.genericsdemo.generics.PQR;

public class Implementer1<T> implements PQR<T> {

	@Override
	public void show(T param) {
		System.out.println("show() called with paramater : " + param);
	}
}
