package com.fibaproject.service;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.fibaproject.Entity.ProductEntity;

public interface ProductService extends CrudRepository<ProductEntity, Long> {

	@Query("select p from Product p where p.category.categoryId = :categoryId")
	List<ProductEntity> findByCategoryId(long categoryId);
}