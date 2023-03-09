package com.exam.entity;

public class PrivilegedAccount extends Account {

	public PrivilegedAccount(int accNo, String name, String accType, Double accBalance) {
		super(accNo, name, accType, accBalance);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void deposit(int amt) {
		System.out.println("YOu can deposit");
		accBalance=accBalance+amt;
		System.out.println("Updated balance after deposit is "+accBalance);
			}
	
	@Override
	public void withdraw(int amt) {
		if(accBalance-amt>-5000) {
			System.out.println("YOu can withdraw");
			accBalance=accBalance-amt;
			System.out.println("Updated balance after the withdraw is "+accBalance);
		}
		else {
			System.out.println("Sorry ! you can't withdraw");
		}
	}
}
