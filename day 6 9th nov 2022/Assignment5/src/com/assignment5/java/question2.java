//2. Create a class corresponding to BankAccount with the data members accno, custname, balamt. Use
//getter and setter methods. Define a method for checking whether the balamt is greater than 20,000
//and display a corresponding message. Create two objects for the class and initialize with different
//values. Invoke the method to check the balance and print the values of data members of two objects .

package com.assignment5.java;

import com.assignment5.entity.bankAccount;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount b1 = new bankAccount();
		b1.setAccno(0);
		b1.setBalamt(80000.00);
		b1.setCustname(null);
		System.out.println(b1.getBalamt());
		b1.checkbalmat();
		
	}

}
