package com.Assignment9.main;
import java.util.Scanner;
public class AppMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String s1=sc.nextLine();
		String revString ="";
		
		int strLength =s1.length();
		
		for (int i =0;i<s1.length();i++) {
			revString = revString+s1.charAt(i);
		}
		if(s1.toLowerCase().equals(revString.toLowerCase())) {
			System.out.println(s1+" is palindrome");
		}
		else {
			System.out.println(s1+" isn't palindrome ");	
		}
	}
}
