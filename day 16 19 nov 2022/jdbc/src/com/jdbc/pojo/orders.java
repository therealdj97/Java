package com.jdbc.pojo;

public class orders {
	private String OrderId; 
	private String customer_id; 
	private int unit_price ;
	private String Employee_id ; 
	private int asset_id ;

	public  orders(){
		super();
	}

	public String getOrderId() {
		return OrderId;
	}

	public void setOrderId(String orderId) {
		OrderId = orderId;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public int getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}

	public String getEmployee_id() {
		return Employee_id;
	}

	public void setEmployee_id(String employee_id) {
		Employee_id = employee_id;
	}

	public int getAsset_id() {
		return asset_id;
	}

	public void setAsset_id(int asset_id) {
		this.asset_id = asset_id;
	}

	@Override
	public String toString() {
		return "Orders is OrderId=" + OrderId + ", customer_id=" + customer_id + ", unit_price=" + unit_price
				+ ", Employee_id=" + Employee_id + ", asset_id=" + asset_id ;
	}

}
