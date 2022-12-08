package com.assignment12.entity;

public class que2 {
	private int acc;
	private int balance;
	
	public  que2(int acc, int balance) {
		super();
		this.acc = acc;
		this.balance = balance;
	}
	public synchronized void withdraw(int amount) {
		System.out.println("checking balance for account no "+this.acc);
		try {
			Thread.sleep(6000);
			if(amount < this.balance) {
				System.out.println(this.acc+" withdrawal started ");
				this.balance = this.balance - amount;
				System.out.println(this.acc+" withdrawal complete. Balance is "+this.balance);
			}
			System.out.println(this.acc+" Insufficient balance. Your balance is "+this.balance);
			wait();
			
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void deposit(int amount) {
		System.out.println("Checking for balance for "+this.acc );
		
		try {
			Thread.sleep(4500);
			this.balance = this.balance+amount;
			
			System.out.println("Deposit completed "+this.balance);
			Thread.sleep(1500);
			
			notifyAll();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}


}
