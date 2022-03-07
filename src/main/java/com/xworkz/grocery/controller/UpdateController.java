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
public class UpdateController {
@Autowired
private GroceryService groceryService;

public UpdateController() {
	System.out.println("Invoked : "+this.getClass().getSimpleName());
} 
@RequestMapping("update.do")
public String onUpdate(@RequestParam String name,@RequestParam String brand,Model model) {
	GroceryDTO dto = this.groceryService.validateAndUpdatebyName(name, brand);
	if (dto != null) {
		model.addAttribute("grocery", dto);
		int total=dto.getQty()*dto.getPrice();
		model.addAttribute("message1", "price :  "+total);
		model.addAttribute("message", "item updated : "+name);
	} else {
		model.addAttribute("message", "cannot be updated");
	}
	return "/UpdateItem.jsp";
}



}
