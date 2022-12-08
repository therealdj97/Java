package com.genericsdemo.main;

import com.genericsdemo.generics.PQR;
import com.genericsdemo.implementer.Implementer1;
import com.genericsdemo.implementer.Implementer2;
import com.genericsdemo.implementer.Implementer3;

public class GenInterfaceMain {

	public static void main(String[] args) {

		PQR<Integer> ref1 = new Implementer1<>();
		ref1.show(456);
		
		Implementer2 ref2 = new Implementer2();
		ref2.show("hello");
		
		Implementer3 ref3 = new Implementer3();
		ref3.show(345);
		ref3.show("hi");
	}
}
