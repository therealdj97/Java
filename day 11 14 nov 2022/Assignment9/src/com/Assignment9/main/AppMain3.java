package com.Assignment9.main;

import com.Assignment9.Entity.BankAccount;

public class AppMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount(12,"Dhiraj",112);
		BankAccount b2 = new BankAccount(13,"Abhi",111);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1.equals(b2));
		
		System.out.println();
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		System.out.println();
		
		b1=null;
		System.gc();
	}
	
}
