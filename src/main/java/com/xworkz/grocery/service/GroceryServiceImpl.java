package com.xworkz.grocery.service;

import javax.persistence.PersistenceException;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;
import com.xworkz.grocery.repository.GroceryRepository;

@Service
public class GroceryServiceImpl implements GroceryService {
	//@Autowired
	private GroceryRepository repo;

	public GroceryServiceImpl(GroceryRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(GroceryEntity Entities) {
		boolean valid = false;
		try {
			if (Entities.getName() == null || Entities.getName().isEmpty() == true || Entities.getName().length() < 3
					|| Entities.getName().length() > 20) {
				valid = false;
				System.out.println("Invalid name");
			} else {
				valid = true;
				System.out.println("Valid name");
			}
			if (Entities.getQty() == 0 || Entities.getQty() < 10) {
				valid = false;
				System.out.println("Invalid Quantity");
			} else {
				valid = true;
				System.out.println("Valid Quantity");
			}
			if(Entities.getPrice()==0) {
				valid = false;
				System.out.println("Invalid Price");
			} else {
				valid = true;
				System.out.println("Valid Price");
			}
			if(Entities.getType()==null ) {
				valid = false;
				System.out.println("Invalid Type");
			} else {
				valid = true;
				System.out.println("Valid Type");
			}
			if(Entities.getBrand()==null) {
				valid = false;
				System.out.println("Invalid Brand");
			} else {
				valid = true;
				System.out.println("Valid Brand");
			}
		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {
		}
		if (valid = true) {
			repo.save(Entities);
		} else {
			System.out.println("Invalid properties,...!");
		}
		return valid;
	}
	public GroceryDTO validateAndFindbyName(String name) {
		boolean valid=false;
		if (name == null || name.isEmpty() == true || name.length()<3 || name.length()>20) {
			valid = false;
			System.out.println("Invalid name");
		} else {
			valid = true;
			System.out.println("Valid name");
		}
		if(valid=true) {
			GroceryEntity entity=this.repo.findByName(name);
			GroceryDTO dto=new GroceryDTO();
			dto.setName(entity.getName());
			dto.setQty(entity.getQty());
			dto.setPrice(entity.getPrice());
			dto.setType(entity.getType());
			dto.setBrand(entity.getBrand());
			//BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return GroceryService.super.validateAndFindbyName(name);
	}
	public GroceryDTO validateAndUpdatebyName(String name, String newBrand) {
		boolean valid=false;
		if (name==null || name.isEmpty()==true || name.length()<3 || name.length()> 20) {
			valid = false;
			System.out.println("Invalid name");
		} else {
			valid = true;
			System.out.println("Valid name");
		}
		if(newBrand==null || newBrand.isEmpty()==true) {
			valid = false;
			System.out.println("Invalid Brand");
		} else {
			valid = true;
			System.out.println("Valid Brand");
		}
		if(valid=true) {
			GroceryEntity entity=this.repo.updateBrandByName(name, newBrand);
			GroceryDTO dto=new GroceryDTO();
			dto.setName(entity.getName());
			dto.setQty(entity.getQty());
			dto.setPrice(entity.getPrice());
			dto.setType(entity.getType());
			dto.setBrand(entity.getBrand());
			//BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return GroceryService.super.validateAndUpdatebyName(name, newBrand);
	}
}
