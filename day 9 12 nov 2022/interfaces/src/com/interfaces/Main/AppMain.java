package com.interfaces.Main;

import com.interfaces.implement.PQR;
import com.interfaces.implement.XYZ;

public class AppMain {
	public static void main(String[] args) {
		PQR ref1 = new PQR();
		ref1.show();
		ref1.display();
		
		XYZ ref2 = new XYZ();
		ref2.show();
		ref2.display();
	}
}