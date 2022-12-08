package com.AssociationDemo.entity;

public class car {
	private String brand;
	private String model;
	private String engine;
	public car(String brand,String model,String engine) {
		this.brand=brand;
		this.model=model;
		this.engine=engine;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public car() {
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
