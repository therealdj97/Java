package com.assignment13.main;

import java.util.HashSet;
import java.util.Set;

import com.assignment13.pojo.product;

public class q3 {

	public static void main(String[] args) {
		Set<product> pset = new HashSet<>();
		
		product p1 = new product(1,"Microwave");
		product p2 = new product(2,"Fridge");
		product p3 = new product(3,"Television");
		product p4 = new product(4,"Ethernet");
		
		
		pset.add(p1);
		pset.add(p2);
		pset.add(p3);
		pset.add(p4);
		
		System.out.println("All products from set are :");
		pset.forEach(System.out::println);
	}

}
