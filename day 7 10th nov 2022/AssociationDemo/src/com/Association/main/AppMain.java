package com.Association.main;

import com.AssociationDemo.entity.Engine;
import com.AssociationDemo.entity.car;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine E1 = new Engine(1500,"diesel");
		car c1 = new car("honda","city",e1);
		
		System.out.println("Details of car c1 are :");
		System.out.println("brand "+c1.getBrand());
		System.out.println("model" +c1.getModel());
		System.out.println("Details of car c1 are :");
		System.out.println("fuel "+c1.getEngine().getFuel());
	}

}
