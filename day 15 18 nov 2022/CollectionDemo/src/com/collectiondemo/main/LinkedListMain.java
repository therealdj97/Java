package com.collectiondemo.main;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
	
		LinkedList<Integer> lst = new LinkedList<>();
		
		lst.add(456);
		lst.add(345);
		lst.add(234);
		lst.add(567);
		
		lst.addFirst(123);
		lst.addLast(789);
		
		System.out.println("All elements from lst are :- ");
		Iterator<Integer> it = lst.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		lst.remove();
		lst.removeFirst();
		lst.removeLast();
		
		System.out.println("All elements from lst are :- ");
		lst.forEach(System.out::println);
		
		System.out.println("result of peekFirst() : " + lst.peekFirst());
		System.out.println("result of peekLast() : " + lst.peekLast());
		
		System.out.println("result of pollFirst() : " + lst.pollFirst());
		System.out.println("result of pollLast() : " + lst.pollLast());
		
		System.out.println("After polling , all elements from lst are :- ");
		lst.forEach(System.out::println);
	}
}






