package com.xworkz.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.service.GroceryService;

@Controller
@RequestMapping("/")
public class SearchController {
	@Autowired
	private GroceryService groceryService;

	public SearchController() {
		System.out.println("created : " + this.getClass().getSimpleName());
	}

	@RequestMapping("search.do")
	public String onSearch(@RequestParam String productName, Model model) {
		GroceryDTO dto = this.groceryService.validateAndFindbyName(productName);
		if (dto != null) {
			model.addAttribute("grocery", dto);
			int total=dto.getQty()*dto.getPrice();
			model.addAttribute("message1", "price :  "+total);
		} else {
			model.addAttribute("message", "Grocery is not found");
		}
		return "/Search.jsp";
	}
}
