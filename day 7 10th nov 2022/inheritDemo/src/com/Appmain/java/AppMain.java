package com.Appmain.java;

import com.inheritDemo.entity.Manager;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr = new Manager();
		mgr.calculateSalary();
		//extensibility as manager has its own methods
		mgr.calculateIncentive();
	}

}
