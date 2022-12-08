package com.oopDemo.main;

import com.oopDemo.entity.product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1  = new product();
//		p1.productId = 1334;
//		p1.productName = "keyboard";
//		p1.showProductDetails();
		
		p1.setProductId(12);
		p1.setProductName("keyboard");
		
		System.out.println("id "+p1.getProductId());
		System.out.println("name "+p1.getProductName());
	}

}
