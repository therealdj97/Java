package com.assignment14.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class q1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter any string sentence ");
		String sent1 = sc.nextLine();
		
		String[]arr=sent1.split(" ");
		
		Map<String,Integer>obj = new HashMap<>();

		for(String s : arr) {
				if(obj.containsKey(s)) {
					obj.put(s, obj.get(s)+1);
				}
				else {
					obj.put(s, 1);
				}
			}
			
			System.out.println("Count of words in statement are : -");
			Set<Entry<String,Integer>> data = obj.entrySet();
			
			for(Entry<String,Integer> a:data) {
				System.out.println(a.getKey()+":"+a.getValue());
				}
			}
		}