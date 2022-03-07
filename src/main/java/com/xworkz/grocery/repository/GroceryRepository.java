package com.xworkz.grocery.repository;

import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryRepository {
public void save(GroceryEntity entity);
 public default GroceryEntity findByName(String name) {
	return null;	
}
 public default GroceryEntity updateBrandByName(String name, String newBrand) {
	 return null;
 }
}
