package com.matk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matk.entity.Shop;
import com.matk.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {

	@Autowired
	private ShopService shopService ;
	
	@GetMapping("/list")
	public String shopList(Model theModel) {
		List<Shop> theShops = shopService.getShops();
		theModel.addAttribute("shops", theShops);
		return "shop-list";
	}
	
	@GetMapping("/addForm")
	public String addForm(Model theModel) {
		Shop theShop = new Shop();
		theModel.addAttribute("shop", theShop);
		return "add-form";
	}
	
	@PostMapping("/saveShop")
	public String saveShop(@ModelAttribute ("shop") Shop theShop) {
		shopService.saveShop(theShop);
		return "redirect:/shop/list";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("shopId") int theId, Model theModel) {
		Shop theShop = shopService.getShop(theId);
		theModel.addAttribute("shop", theShop);
		return "add-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("shopId") int theId) {
		shopService.deleteShop(theId);
		return "redirect:/shop/list";
	}
	
	@PostMapping("/search")
    public String searchShops(@RequestParam("theSearchName") String theSearchName,
                                    Model theModel) {

        List<Shop> theShops = shopService.searchShops(theSearchName);
        theModel.addAttribute("shops", theShops);
        return "shop-list";        
    }
}











