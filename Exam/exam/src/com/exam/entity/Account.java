package com.exam.entity;

public class Account {
	protected int accNo;
	protected String Name;
	protected String accType;
	protected Double accBalance;
	
	public Account(int accNo, String name, String accType, Double accBalance) {
		super();
		this.accNo = accNo;
		Name = name;
		this.accType = accType;
		this.accBalance = accBalance;
	}
	
	public void deposit(int amt) {
		System.out.println("Enter deposited is"+amt);
		accBalance = accBalance+amt;
		System.out.println("Updated balance in account is "+accBalance);
	}
	
	public void withdraw(int amt) {
		System.out.println("amount to be withdrawn is"+amt);
		accBalance=accBalance-amt;
		System.out.println("Updated balance amount in account after withdraw is "+accBalance);
	}
	
	public void checkBalance() {
		System.out.println("Your current Balance Amount is "+accBalance);
	}
}
