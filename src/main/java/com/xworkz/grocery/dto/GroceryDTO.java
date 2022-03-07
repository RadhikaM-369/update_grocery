package com.xworkz.grocery.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GroceryDTO {
	private String name;
	private int qty;
	private int price;
	private String type;
	private String brand;
	private int total;

	public GroceryDTO(String name, int qty, int price, String type, String brand) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.type = type;
		this.brand = brand;
	}

}
