package com.Assignment7.main;

import com.Assignmet7.Entity.Exam;

public class AppMain5 {
	public static void main(String args[]) {
		Exam c1 = new Exam();
		c1.chkGrade(55);
		boolean a=c1.checkStatus(60);
		System.out.println(a);
	}
	
	
}
