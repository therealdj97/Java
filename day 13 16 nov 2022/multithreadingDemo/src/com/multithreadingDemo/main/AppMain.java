package com.multithreadingDemo.main;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = Thread.currentThread();
		System.out.println("current thread "+th);
		th.setName("New thread");
		th.setPriority(5);
		System.out.println("current thread "+th);
		
		try {
			for (int i=0;i<10;i++) {
				System.out.println(i);
				Thread.sleep(4000);
			}			
		}
		catch(InterruptedException exc) {
			exc.printStackTrace();
		}

	}

}
