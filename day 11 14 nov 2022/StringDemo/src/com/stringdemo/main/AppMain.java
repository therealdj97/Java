package com.stringdemo.main;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("hi");
		String s2 = new String("hi");
		String s3 = ("hi");
		String s4 = ("hi");
		if (s1 == s2)
				System.out.println("fine");
		else 
			System.out.println("not fine");
		if (s3==s4)
			System.out.println("well");
		else 
			System.out.println("not well");
	}

}
