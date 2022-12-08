package com.jdbcdemo.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.jdbcdemo.connection.DbConnection;
import com.jdbcdemo.dao.ProductDao;
import com.jdbcdemo.pojo.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getAllProducts() {
		List<Product> lst = new ArrayList<>();
		
		try (Connection con = DbConnection.getDatabaseConnection()) {
			
			PreparedStatement pst = con.prepareStatement(
					"SELECT * FROM product");
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					Product product = new Product();
					product.setPid(rs.getInt("pid"));
					product.setPname(rs.getString("pname"));
					product.setPrice(rs.getInt("price"));
					lst.add(product);
				}
			}
			
			return lst;
		} catch (SQLException e) {
			e.printStackTrace();
			lst.clear();
			return lst;
		} 
	}

	@Override
	public Product searchProductById(int id) {
		Product product = null;
		
		try (Connection con = DbConnection.getDatabaseConnection()) {
			
			PreparedStatement pst = con.prepareStatement(
					"SELECT * FROM product WHERE pid = ?");
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.isBeforeFirst()) {
					rs.next();
					product = new Product();
					product.setPid(rs.getInt("pid"));
					product.setPname(rs.getString("pname"));
					product.setPrice(rs.getInt("price"));
			}
			
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addNewProduct(Product product) {
		
		try (Connection con = DbConnection.getDatabaseConnection()) {
					
			PreparedStatement pst = con.prepareStatement(
					"INSERT INTO product(pname,price) VALUES(?,?)");
			
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			
			int count = pst.executeUpdate();
			
			if(count > 0)
				return true;
			else
				return false;	
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		
		try (Connection con = DbConnection.getDatabaseConnection()) {
			
			PreparedStatement pst = con.prepareStatement(
			"UPDATE product SET pname = ? , price = ? WHERE pid = ?");
			
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setInt(3, product.getPid());
			
			int count = pst.executeUpdate();
			
			if(count > 0)
				return true;
			else
				return false;	
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(int id) {
		
		try (Connection con = DbConnection.getDatabaseConnection()) {
			
			PreparedStatement pst = con.prepareStatement(
			"DELETE FROM product WHERE pid = ?");
			
			pst.setInt(1, id);
			
			int count = pst.executeUpdate();
			
			if(count > 0)
				return true;
			else
				return false;	
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
