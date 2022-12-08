package com.assignment13.pojo;

import java.util.Objects;

public class product {
	
	private int id;
	private String name;

	public product(int id, String name) {
		this.id=id;
		this.name =name;
	}
	public product() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		product other = (product) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}
}
