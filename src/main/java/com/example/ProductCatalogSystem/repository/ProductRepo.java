package com.example.ProductCatalogSystem.repository;

import com.example.ProductCatalogSystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
