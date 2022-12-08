package com.multithreadingDemo.threads;

public class runnable implements Runnable{
	@Override
	public void  run(){
		try {
			for(int i=10;i<=20;i+=1) {
				System.out.println("runnable says "+i);
				Thread.sleep(2000);
			}
			System.out.println("out of runnable");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
