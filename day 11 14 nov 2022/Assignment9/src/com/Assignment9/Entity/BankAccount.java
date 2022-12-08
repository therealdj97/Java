package com.Assignment9.Entity;

import java.util.Objects;

public class BankAccount {
	private int accno;
	private String name;
	public int getAccno() {
		return accno;
	}
	private int acctbal ;
	
	public BankAccount(int accno,String name,int acctbal) {
		this.accno=accno;
		this.name=name;
		this.acctbal=acctbal; 
	}
	
	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcctbal() {
		return acctbal;
	}

	public void setAcctbal(int acctbal) {
		this.acctbal = acctbal;
	}
	@Override 
	public String toString() {
		return accno+" "+name+" "+acctbal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accno,acctbal);
	}
	
	@Override
	public boolean equals(Object obj) {
		BankAccount ref = (BankAccount) obj;
		if(this.accno==ref.accno && this.acctbal==ref.acctbal)
			return true;
		else 
			return false;
	}
	protected void finalize() throws Throwable{
		System.out.println(acctbal+" "+name+" "+accno);
	}

}
