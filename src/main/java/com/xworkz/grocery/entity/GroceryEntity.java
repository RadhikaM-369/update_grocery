package com.xworkz.grocery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "grocery_info")
public class GroceryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int Id;
	@Column(name = "G_name")
	private String name;
	@Column(name = "QTY")
	private int qty;
	@Column(name = "PRICE")
	private int price;
	@Column(name = "G_type")
	private String type;
	@Column(name = "BRAND")
	private String brand;
	/*@Column(name = "TOTAL")
	private int total;*/
	public GroceryEntity(String name, int qty, int price, String type, String brand) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.type = type;
		this.brand = brand;
	}

}
