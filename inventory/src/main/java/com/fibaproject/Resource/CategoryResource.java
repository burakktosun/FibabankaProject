package com.fibaproject.Resource;


import com.fibaproject.Entity.CategoryEntity;
import com.fibaproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("inventory/api/categories")
	public Iterable<CategoryEntity> getCategories() {
		Iterable<CategoryEntity> categorytList = categoryService.findAll();
		return categorytList;
	}	
}