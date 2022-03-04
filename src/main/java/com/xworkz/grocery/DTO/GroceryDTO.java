package com.xworkz.grocery.DTO;

public class GroceryDTO {
	private String name;
	private int qty;
	private int price;
	private String type;
	private String brand;
	
	public GroceryDTO(String name, int qty, int price, String type, String brand) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.type = type;
		this.brand = brand;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
