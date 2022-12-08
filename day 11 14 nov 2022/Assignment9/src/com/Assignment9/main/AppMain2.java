package com.Assignment9.main;

import com.Assignment9.Entity.Employee;

public class AppMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(14,"Dhiraj","Manager",11000);
		Employee e2 = new Employee(15,"rohit","Manager",11000);
		System.out.println((e1.equals(e2)));
	}

}
