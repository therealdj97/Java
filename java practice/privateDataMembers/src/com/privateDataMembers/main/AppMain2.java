package com.privateDataMembers.main;

import com.privateDataMembers.entity.GettersSetters;

public class AppMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GettersSetters gs1  = new GettersSetters();
		gs1.setName("Dhiraj");
		gs1.setRollNo(14);
		System.out.println("name is "+gs1.getName()+
				" roll no is "+gs1.getRollNo());
	}

}
