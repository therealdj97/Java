//4. Create a class named Employee having the following data members:
//name
//age
//phoneno
//address
//salary
//It also has a method named printSalary which prints the salary of the members.
//Another class Manager inherits the Employee class. The Manager class have data
//member department. Now, assign name, age, phone number, address, salary and
//department to a manager by making an object of Manager class and print the salary.
package com.Assignment6.main;

import com.Assignment6.Entity.manager;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m1 = new manager();
		m1.setName("dhiraj");
		m1.setAddress("Dombivali");
		m1.setAge(25);
		m1.setPhoneno(887988395);
		m1.setSalary(10000);
		m1.setDepartment("IT");
		System.out.println("salary of manager is "+m1.getSalary());
	}

}