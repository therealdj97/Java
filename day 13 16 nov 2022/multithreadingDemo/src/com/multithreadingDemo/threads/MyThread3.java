package com.multithreadingDemo.threads;

public class MyThread3 extends Thread{
	@Override
	public void run() {
		try {
			for (int i=0;i<=5;i++) {
				System.out.println("hello from base class "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			}
	}
}
