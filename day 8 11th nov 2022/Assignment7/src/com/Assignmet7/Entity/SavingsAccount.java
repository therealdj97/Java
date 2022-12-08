package com.Assignmet7.Entity;

public class SavingsAccount extends Account{

	public SavingsAccount(int accNo, String Name, String accType, Double accBalance) {
		super(accNo, Name, accType, accBalance);
		// TODO Auto-generated constructor stub
		
	}
	private int amt;
	
	@Override
	public void deposit(int amt) {
		if(amt<50000) {
			System.out.println("Amount can be deposited ");
			accBalance=accBalance+amt;
			System.out.println("Updated balance is "+accBalance);
		}
		else {
			System.out.println("Amount can not be deposited ");
		}
	}
	
	@Override
	public void withdraw(int amt) {
		if(amt>accBalance && accBalance<1000) {
			System.out.println("Ammount can't be withdrawn");
			System.out.println("Withdrawn amout is " + amt);
			System.out.println("Updated balance is "+accBalance);
		}
		else {
			System.out.println("Amount can be withdrawn");
			accBalance=accBalance-amt;
			System.out.println("Updated balance is "+accBalance);
		}
	}

}
