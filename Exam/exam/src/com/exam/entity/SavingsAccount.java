package com.exam.entity;

public class SavingsAccount extends Account {

	public SavingsAccount(int accNo, String name, String accType, Double accBalance) {
		super(accNo, name, accType, accBalance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void deposit(int amt) {
		if(amt<50000) {
			System.out.println("You can deposit");
			accBalance=accBalance+amt;
			System.out.println("Updated Balance is "+accBalance);
		}
		else{
			System.out.println("You can only deposit maximum 50,000 in one transcation");
		}

	}
	
	@Override
	public void withdraw(int amt) {
		if(accBalance-amt<1000) {
			System.out.println("you can't withdraw your balance is below 1000");
		}
		else{
			System.out.println("You can withdraw");
			accBalance=accBalance-amt;
			System.out.println("updated balance after withdraw is "+accBalance);
		}
	}
}
