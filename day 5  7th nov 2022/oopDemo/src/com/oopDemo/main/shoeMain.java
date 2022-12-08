package com.oopDemo.main;

import com.oopDemo.entity.shoe;

public class shoeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shoe s1 = new shoe();
		s1.manufactureShoe("sports",15,"bata");
		System.out.println("deatails are");
		s1.showShoeDetails();
		
	}

}
