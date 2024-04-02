package com.example.ProductCatalogSystem.controller;

import com.example.ProductCatalogSystem.entity.Product;
import com.example.ProductCatalogSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/")
    public String showOptions()
    {
        return "index";
    }
    @GetMapping("/addProduct")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "add_product";
    }

    @PostMapping("/addProduct")
    public String addProduct(Product product) {
        service.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping("/catalog")
    public String showProductCatalog(Model model) {
        model.addAttribute("products", service.getAllProducts());
        return "product_catalog";
    }
}

