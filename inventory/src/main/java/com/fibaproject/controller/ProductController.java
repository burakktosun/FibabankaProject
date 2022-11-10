package com.fibaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fibaproject.Entity.ProductEntity;

@Controller
public class ProductController {

	
	@GetMapping("inventory/product/{id}")
	@ResponseBody
	public String getProduct(@PathVariable("id") long productId) {
		String url = "http://localhost:8080/inventory/api/product/" + productId;
		RestTemplate restTemplate = new RestTemplate();
		ProductEntity product = restTemplate.getForObject(url, ProductEntity.class);
		System.out.println("ürün:  " + product.getProductName());
		return "Edinme başarılı " + product.getProductName() + " " + product.getSalesPrice();
	}
	
	@GetMapping("inventory/products/{categoryid}")
	@ResponseBody
	public String getProductsByCategory(@PathVariable("categoryid") long categoryId) {
		String url = "http://localhost:8080/inventory/api/products/" + categoryId;
		RestTemplate restTemplate = new RestTemplate();
		ProductEntity product = restTemplate.getForObject(url, ProductEntity.class);
		System.out.println("ürün:  " + product.getProductName());
		return "Edinme başarılı " + product.getProductName() + " " + product.getSalesPrice();
	}

	

}
