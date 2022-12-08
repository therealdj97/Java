package com.oopDemo.entity;

public class product {
	private int productId;
	private String productName; 
//	public void showProductDetails() {
//		System.out.println("id"+productId+"name"+productName);
//	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
}
