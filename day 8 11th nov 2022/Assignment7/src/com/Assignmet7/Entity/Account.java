package com.Assignmet7.Entity;

public class Account {
	protected int accNo;
	protected  String Name;
	protected String accType;
	protected Double accBalance;
	
	public Account(int accNo,String Name,String accType,Double accBalance) {
		this.accNo = accNo;
		this.Name = Name;
		this.accType = accType;
		this.accBalance=accBalance;
	}
	
	public void deposit(int amt) {
		System.out.println("added ammount is "+amt);
		accBalance= amt+accBalance;
		System.out.println("Final amount is "+accBalance);
	}
	
	public void withdraw(int amt){
		
		System.out.println("added ammount is "+amt);
		accBalance= amt-accBalance;
		System.out.println("FInal amount is "+accBalance);
	}
	
	public void checkBalance() {
		System.out.println(accBalance);
	}

	
}
