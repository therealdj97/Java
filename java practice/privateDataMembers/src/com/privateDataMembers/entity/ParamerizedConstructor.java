package com.privateDataMembers.entity;

public class ParamerizedConstructor {
	private String name;
	private int RollNo;
	
	public ParamerizedConstructor (int RollNo, String name) {
		this.name = name;
		this.RollNo = RollNo; 
	}
	
	public void  getDetails() {
		System.out.println("name is "+name+" Roll no is "+RollNo);
	}

}
