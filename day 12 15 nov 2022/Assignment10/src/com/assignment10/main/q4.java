package com.assignment10.main;

import com.assignment10.Entity.IllegalMarkException;
import com.assignment10.Entity.MarkProcess;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarkProcess m1 = new MarkProcess(1200,55);
		MarkProcess m2 = new MarkProcess();
		try {
			System.out.println("For 1st student");
			m1.validation();
			m1.result();
			System.out.println("For 2nd student");
			m2.setRegno(1230);
			m2.setMarks(-12);
			m2.validation();
			m2.result();
		}
		catch(IllegalMarkException exc) {
			System.out.println(exc.getMessage());
		}
	}
}
