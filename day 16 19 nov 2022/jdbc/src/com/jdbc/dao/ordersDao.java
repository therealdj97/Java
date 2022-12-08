package com.jdbc.dao;

import java.util.List;

import com.jdbc.pojo.orders;

public interface ordersDao {
	
	
	// query operation (fetching data from database)
	List<orders> getAllOrders();
	orders searchOrderById(String id); // read
	
	// write operations (performing write(update/ delete) on database)
	boolean addNewOrder(orders order); //create
	boolean updateOrder(orders order); // update
	boolean deleteOrder(String orderId); // delete	 
}
