package com.Assignment7.main;

import com.Assignmet7.Entity.PrevilegedAccount;
//import com.Assignmet7.Entity.PrevilegedAccount;
import com.Assignmet7.Entity.SavingsAccount;

public class AppMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		SavingsAccount s1 = new SavingsAccount(10, "Dhiraj", "Savings", 1100.00);
		
		s1.deposit(1000);
		s1.checkBalance();
		s1.withdraw(500);
		s1.checkBalance();
		
		PrevilegedAccount p1 = new PrevilegedAccount(0, "Abhi", "Privileged", 0.00);
		
		p1.deposit(000);
		//p1.withdraw(4999);
		p1.checkBalance();
		p1.withdraw(5001);
	}

}
