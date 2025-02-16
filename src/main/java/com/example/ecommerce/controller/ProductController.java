package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.ProductModel;
import com.example.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    // @GetMapping
    // public String test() {
    //     return "Hello World";
    // }

    @GetMapping
    public List<ProductModel> getProducts() {
        return productService.getProducts();
    }

    //get Product by Id
    @GetMapping("/{id}")
    public ProductModel getProductById(Long id) {
        return productService.getProductById(id);
    }

    //create Product
    @PostMapping
    public ProductModel createProduct(ProductModel product) {
        return productService.createProduct(product);
    }

    //update Product
    @PutMapping("/{id}")
    public ProductModel updateProduct(ProductModel product) {
        return productService.updateProduct(product);
    }

    //delete Product
    @DeleteMapping("/{id}")
    public void deleteProduct(Long id) {
        productService.deleteProduct(id);
    }
}
