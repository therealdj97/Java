package com.jdbcdemo.main;

import java.util.List;
import java.util.Scanner;

import com.jdbcdemo.dao.ProductDao;
import com.jdbcdemo.daoimpl.ProductDaoImpl;
import com.jdbcdemo.pojo.Product;

public class AppMain {

	public static void main(String[] args) {
	
		ProductDao daoImpl = new ProductDaoImpl();
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("All products from database are :- ");
//		List<Product> lst = daoImpl.getAllProducts();
//		if(lst.size() > 0)
//			lst.forEach(System.out::println);
//		else
//			System.out.println("no products found");
		
		
		
//		System.out.print("Enter id of the product to be searched : ");
//		int id = scanner.nextInt();
//		
//		Product pr = daoImpl.searchProductById(id);
//		if(pr != null)
//			System.out.println(pr);
//		else
//			System.out.println("No such product found");
		
//		System.out.print("Enter name for new product : ");
//		String name = scanner.next();
//		
//		System.out.print("Enter price for new product : ");
//		int prc = scanner.nextInt();
//		
//		Product product = new Product();
//		product.setPname(name);
//		product.setPrice(prc);
//		
//		if(daoImpl.addNewProduct(product))
//			System.out.println("product was added successfully");
//		else
//			System.out.println("product was not added");
		
		System.out.print("Enter id of the product to be updated : ");
		int id = scanner.nextInt();
		
		System.out.print("Enter new name for the product : ");
		String name = scanner.next();
		
		System.out.print("Enter new price for the product : ");
		int prc = scanner.nextInt();
		
		Product product = new Product();
		product.setPid(id);
		product.setPname(name);
		product.setPrice(prc);
		
		if(daoImpl.updateProduct(product))
			System.out.println("product was updated successfully");
		else
			System.out.println("product was not updated or no"
					+ " such product found");
		
//		System.out.print("Enter id of the product to be deleted : ");
//		int id = scanner.nextInt();
//		
//		if(daoImpl.deleteProduct(id))
//			System.out.println("product was deleted successfully");
//		else
//			System.out.println("product was not deleted or no"
//					+ " such product found");
	}
}