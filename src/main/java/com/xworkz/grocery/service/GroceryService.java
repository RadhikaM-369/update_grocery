package com.xworkz.grocery.service;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryService {
boolean validateAndSave(GroceryEntity Entities);
public default GroceryDTO validateAndFindbyName(String name) {
	return null;
}
public default GroceryDTO validateAndUpdatebyName(String name, String newBrand) {
	return null;
}
}
