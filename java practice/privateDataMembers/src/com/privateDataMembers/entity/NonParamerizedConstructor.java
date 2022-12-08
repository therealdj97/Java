package com.privateDataMembers.entity;

public class NonParamerizedConstructor {
	private String name;
	private int RollNo;
	
	public NonParamerizedConstructor(){
		name = "Dhiraj";
		RollNo = 14;
	}
	
	public void getDetails() {
		System.out.println("name is "+name+" Roll no is "+RollNo);
	}

}
