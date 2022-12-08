package com.oopDemo.main;
import com.oopDemo.entity.Engine;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine e1 = new Engine();
		e1.manufactureEngine();
		System.out.println("for e1");
		e1.showEngineDetails();
		
		Engine e2 = new Engine();
		e2.manufactureEngine();
		System.out.println("for e2");
		e2.showEngineDetails();
		
		Engine e3 = new Engine();
		e3.manufactureEngine(1500,"diesel");
		System.out.println("for e3");
		e3.showEngineDetails();
	}

}
