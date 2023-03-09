package com.exam.main;

import com.exam.entity.PrivilegedAccount;
import com.exam.entity.SavingsAccount;

public class AppMain {

	public static void main(String[] args) {

		SavingsAccount s1 = new SavingsAccount(11, "Akash", "Savings", 1150.00);
		System.out.println("Savings Account");
		s1.deposit(50001);
		s1.checkBalance();
		s1.withdraw(500);
		s1.withdraw(500);
		s1.checkBalance();

		PrivilegedAccount p1 = new PrivilegedAccount(12, "Dhiraj", "Privileged", 0000.00);
		System.out.println("Privileged Account");
		p1.checkBalance();
		p1.withdraw(4999);
		p1.checkBalance();
		p1.deposit(200000);
		p1.checkBalance();
	}
}
