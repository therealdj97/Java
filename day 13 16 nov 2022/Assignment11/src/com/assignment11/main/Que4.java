package com.assignment11.main;

import com.assignment11.entity.Q4;
import com.assignment11.entity.Q4A;

public class Que4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Q4A());
		Thread t2 = new Thread(new Q4());
		
		t1.start();
		System.out.println();
		t2.start();

	}

}
