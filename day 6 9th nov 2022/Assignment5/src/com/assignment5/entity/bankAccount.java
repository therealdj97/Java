//2. Create a class corresponding to BankAccount with the data members accno, custname, balamt. Use
//getter and setter methods. Define a method for checking whether the balamt is greater than 20,000
//and display a corresponding message. Create two objects for the class and initialize with different
//values. Invoke the method to check the balance and print the values of data members of two objects .
package com.assignment5.entity;
import java.util.Scanner;
public class bankAccount {
	private int accno;
	private String custname;
	private Double balamt;
	
//	public void details() {
//		Scanner sc = new Scanner(System.in);
//		accno = sc.nextInt();
//		custname = sc.next();
//		balamt = sc.nextDouble();		
//	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Double getBalamt() {
		return balamt;
	}
	public void setBalamt(Double balamt) {
		this.balamt = balamt;
	}
	public void checkbalmat() {
		if(balamt>20000) {
			System.out.println("Balance is Greater than 20,000");
		}
	}
	
}
