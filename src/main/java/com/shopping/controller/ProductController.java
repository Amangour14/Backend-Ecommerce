package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Product;
import com.shopping.service.ProductService;

import java.util.Base64;
import java.util.List;
 
@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
 
    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> getAll() {
        return productService.getAllProduct();
    }
    
    @PostMapping("/upload")
    public Product add(@RequestBody Product product) {
    	return productService.addProduct(product);
    }
    
    
}
