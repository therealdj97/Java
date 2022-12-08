package com.collectiondemo.pojo;

import java.util.Objects;

public class Product {

	private int pid;
	private String pname;
	
	public Product(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}

	public Product() {
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	@Override
	public String toString() {
		return pid + " : " + pname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}

	@Override
	public boolean equals(Object obj) {
		Product prd = (Product) obj;
		return this.pid == prd.pid;
	}
}











