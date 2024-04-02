package com.example.ProductCatalogSystem.service;

import com.example.ProductCatalogSystem.entity.Product;

import java.util.List;

public interface ProductImpln {
    public List<Product> getAllProducts();
    public void saveProduct(Product product);
}
