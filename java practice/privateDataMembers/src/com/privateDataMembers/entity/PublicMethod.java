package com.privateDataMembers.entity;

public class PublicMethod {
	private String name ;
	private int RollNo ;
	
	public void details() {
		name = "dhiraj";
		RollNo = 10;
		
	}
	
	public void showDetails() {
		System.out.print("name is "+name+" RollNo is "+RollNo);
	}
}
