package com.fibaproject.Resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fibaproject.Entity.ProductEntity;
import com.fibaproject.service.ProductService;

@RestController
public class ProductResource {

	@Autowired
	private ProductService productService;

	@GetMapping("inventory/api/product/{id}")
	public Optional<ProductEntity> getProduct(@PathVariable("id") long productId) {
		Optional<ProductEntity> product = productService.findById(productId);
		return product;
	}
	
	@GetMapping("inventory/api/products/{categoryid}")
	public List<ProductEntity> getProductsByCategory(@PathVariable("categoryid") long categoryId) {
		List<ProductEntity> product = productService.findByCategoryId(categoryId);
		return product;
	}
}