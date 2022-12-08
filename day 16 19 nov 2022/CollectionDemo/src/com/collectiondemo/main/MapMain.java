package com.collectiondemo.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {

	public static void main(String[] args) {

		Map<Integer, String> hmap = new HashMap<>();
		
		hmap.put(1233, "XYZ");
		hmap.put(1237, "ABC");
		hmap.put(1234, "DEF");
		hmap.put(1235, "RTY");
		hmap.put(1236, "HBI");
		hmap.put(1235, "BNM");
		
		System.out.println("All entries from hmap are :- ");
		
		Set<Entry<Integer, String>> eset = hmap.entrySet();
		
		for(Entry<Integer, String> e : eset) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		System.out.println("All keys in hmap are :- ");
		Set<Integer> keys = hmap.keySet();
		
		for(Integer key : keys)
			System.out.println(key);
		
		System.out.println("is key 1236 present in hmap : " + 
					hmap.containsKey(1236));
		
		System.out.println("is value BNM present in hmap : " + 
				hmap.containsValue("BNM"));
		
		System.out.println("Value associated with key 1234 : " +
				hmap.get(1234));
		
		hmap.remove(1235);
		hmap.remove(1236, "Sandip");
		
		System.out.println("After removal , all entries from hmap are : ");
		eset = hmap.entrySet();
		
		for(Entry<Integer, String> e : eset) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		
		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(1233, "XYZ");
		tmap.put(1237, "ABC");
		tmap.put(1234, "DEF");
		tmap.put(1235, "RTY");
		tmap.put(1236, "HBI");
		tmap.put(1235, "BNM");
		
		System.out.println("All entries from tmap are :- ");
		
		eset = tmap.entrySet();
		
		for(Entry<Integer, String> e : eset) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}






