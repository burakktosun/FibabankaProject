package com.fibaproject.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fibaproject.Entity.CategoryEntity;

@RestController
public class CategoryController {

	@GetMapping("inventory/categories")
	@ResponseBody
	public String listProducts() {
		String url = "http://localhost:8080/inventory/api/categories";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<CategoryEntity> response = restTemplate.getForEntity(url, CategoryEntity.class);
		CategoryEntity categories =response.getBody();
		
	return "Kategori adedi " +categories;
	}	
}
