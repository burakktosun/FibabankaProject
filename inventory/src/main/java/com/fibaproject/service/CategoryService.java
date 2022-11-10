package com.fibaproject.service;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.fibaproject.Entity.CategoryEntity;


public interface CategoryService extends CrudRepository<CategoryEntity, Long> {
	@Query("select p from Category as p")
	List<CategoryEntity> findAll();
}