package com.example.kishore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kishore.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public List<Product> findByNameContainingIgnoreCase(String name);
}
