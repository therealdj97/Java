package com.collectiondemo.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.collectiondemo.pojo.Engine;

public class ListMain {

	public static void main(String[] args) {
	
		List<Engine> lstEngines = new ArrayList<>(); 
		
		Engine e1 = new Engine(1200, "petrol");
		Engine e2 = new Engine(1000, "cng");
		Engine e3 = new Engine(1500, "diesel");
		Engine e4 = new Engine(1400, "petrol");
		
		lstEngines.add(e1);
		lstEngines.add(e3);
		lstEngines.add(e2);	
		lstEngines.add(1,e4);
		
		System.out.println("All engines from lstEngines are :- ");
		for(Engine e : lstEngines)
			System.out.println(e);
		
		Engine e5 = new Engine(1400, "petrol");
		System.out.println("Is e5 present in lstEngines : " +
						lstEngines.contains(e5));
		
		System.out.println("e5 is present in lstEngines at index : "+
						lstEngines.indexOf(e5));
		
		System.out.println("engine present in lstEngines at index 2 : "
						+ lstEngines.get(2));
		
		lstEngines.remove(2);
		lstEngines.remove(e5);
		
		System.out.println("After removal , "
				+ "all engines from lstEngines are : ");
		lstEngines.forEach(System.out::println);
		
		System.out.println("Now total engines in lstEngines : " + 
				lstEngines.size());
		
		// array to a list 
		
		Integer[] arr = {10,20,30,40,50};
		List<Integer> lst = Arrays.asList(arr);
		System.out.println("All elements from lst are :- ");
		lst.forEach(System.out::println);
		
		
		// list to an array
		
		List<String> lst2 = new ArrayList<>();
		lst2.add("Anil");
		lst2.add("Sandip");
		Object[] ar = lst2.toArray();
		System.out.println("All elements from ar are :- ");
		for(Object obj : ar)
			System.out.println(obj);
	}
}











