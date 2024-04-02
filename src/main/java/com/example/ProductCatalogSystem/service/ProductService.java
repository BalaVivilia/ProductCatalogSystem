package com.example.ProductCatalogSystem.service;

import com.example.ProductCatalogSystem.entity.Product;
import com.example.ProductCatalogSystem.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductImpln{

    @Autowired
    ProductRepo repo;
    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        repo.save(product);

    }
}
