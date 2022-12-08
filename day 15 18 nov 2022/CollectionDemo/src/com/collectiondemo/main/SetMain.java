package com.collectiondemo.main;

import java.util.HashSet;
import java.util.Set;

import com.collectiondemo.pojo.Product;

public class SetMain {

	public static void main(String[] args) {

		Set<Product> pset = new HashSet<>();
		
		Product p1 = new Product(1233, "keyboard");
		Product p2 = new Product(1235, "mouse");
		Product p3 = new Product(1234, "pendrive");
		Product p4 = new Product(1234, "usbdrive");
		
		pset.add(p1);
		pset.add(p2);
		pset.add(p3);
		pset.add(p4);
		
		System.out.println("All products from pset are :- ");
		pset.forEach(System.out::println);
	}
}














