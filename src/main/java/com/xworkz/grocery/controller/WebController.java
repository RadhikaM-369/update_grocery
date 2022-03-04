package com.xworkz.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.grocery.DTO.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;
import com.xworkz.grocery.service.GroceryServiceImpl;

@Controller
@RequestMapping("/")
public class WebController {
	@Autowired
	private GroceryServiceImpl groceryServiceImpl;

	public WebController(GroceryServiceImpl groceryServiceImpl) {
		this.groceryServiceImpl = groceryServiceImpl;
	}

	@RequestMapping("item.do")
	public String onClick() {
		System.out.println("Invoked Onclick ");
		return "/HomePage.jsp";
	}

	@RequestMapping("additem.do")
	public String addClick(GroceryDTO grocerydto, Model model) {
		System.out.println("Invoked Onclick ");
		System.out.println(grocerydto);
		GroceryEntity entity = new GroceryEntity(grocerydto.getName(), grocerydto.getQty(), grocerydto.getPrice(),
				grocerydto.getType(), grocerydto.getBrand());
		System.out.println(grocerydto.toString());
		boolean checkValidity = groceryServiceImpl.validateAndSave(entity);
		if (checkValidity = true) {
			System.out.println("All properties are valid");
			model.addAttribute("message", "Added grocery, below are details : " );
			model.addAttribute("messageN", "Item Name : " + grocerydto.getName());
			model.addAttribute("messageQ", "Quantity : "+ grocerydto.getQty());
			model.addAttribute("messageP", "Price : "+ grocerydto.getPrice());
			model.addAttribute("messageT", "Type : "+ grocerydto.getType());
			model.addAttribute("messageB", "Brand : "+ grocerydto.getBrand());
			int total=grocerydto.getQty()*grocerydto.getPrice();
			model.addAttribute("message1", "Total :  "+total);
			
		} else {
			System.out.println("invalid properties...!");
			model.addAttribute("message", "Contact not saved...!");
		}
		return "/AddItemResult.jsp";
	}

	/*@RequestMapping("result.do")
	public String addResult(GroceryDTO grocerydto,Model model) {
		System.out.println("Invoked addResult ");
		
		int total=grocerydto.getQty()*grocerydto.getPrice();
		model.addAttribute("message1", "Total :  "+total);
		System.out.println("Total : "+total);
		return "/AddItemResult.jsp";
	}*/
	
}
