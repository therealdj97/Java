package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowAllMain {

	public static void main(String[] args) {
		
		try {
			
			// 1 load database driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2  establish connection to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transport?useSSL=false","root","123456");
			System.out.println("connection established to database");

			
			//3 create statement to execute query 
			
			java.sql.Statement st =  con.createStatement();
			
			//4 execute query 
			//5  store result of query into result set 
			ResultSet rs = ((java.sql.Statement) st).executeQuery("SELECT * FROM orders");
			
			//6 process data from result set
			
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					System.out.println("Asset id is "+rs.getInt("asset_id")+":"+" unit price is "+rs.getInt("unit_price"));
				}
				System.out.println("reached end of result");
				
			}
			else
				System.out.println("no products found in database");
			
			// close database connection 
			
			con.close();
			System.out.println("connection closed");
			
		}
		catch(ClassNotFoundException | SQLException exc) {
			exc.printStackTrace();
		}
	}
}
