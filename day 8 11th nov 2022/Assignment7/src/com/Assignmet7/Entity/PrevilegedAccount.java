package com.Assignmet7.Entity;
public class PrevilegedAccount extends Account   {

	public PrevilegedAccount(int accNo, String Name, String accType, Double accBalance) {
		super(accNo, Name, accType, accBalance);
		// TODO Auto-generated constructor stub
	}
	private int amt;
	
	@Override
	public void deposit(int amt) {
		System.out.println("amount deposited is "+amt);
		accBalance=accBalance+amt;
		System.out.println("Updated balance is "+accBalance);
	
	}
	
	@Override
	public void withdraw(int amt) {
		//if(amt<accBalance+5000) {
		if(accBalance - amt > -5000) {
			System.out.println("Ammount can be withdrawn");
			accBalance=accBalance-amt;
			System.out.println("Withdrawn Ammount is "+amt);
			System.out.println("Updated balance is "+accBalance);
		}
		else {
			System.out.println("Amount can't be withdrawn");
		}
	}
}
