package com.assignment12.main;

import com.assignment12.entity.que2;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		que2 q1 = new que2(565,810000);
		
		Thread t1 = new Thread(() -> q1.withdraw(100000));
		
		Thread t2 = new Thread(() -> q1.deposit(24000));
		
		t1.start();
		t2.start();


	}

}
