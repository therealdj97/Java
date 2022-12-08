package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection implements DbDetails{
	
	public static Connection getDatabaseConnection() {
		
		try{
			// 1 load database driver.
			Class.forName(DbDetails.DBDRIVER);
			
			//2  establish connection to database
			Connection con = DriverManager.getConnection(DbDetails.CONSTR,DbDetails.UNAME,DbDetails.PASSWD);
			System.out.println("connection established to database");
			return con;
			
		}
		catch(SQLException | ClassNotFoundException exc ) {	
			exc.printStackTrace();
			System.out.println("Error in connecting to database");
			return null;
		}
	}
}
