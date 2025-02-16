package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.ProductModel;
import com.example.ecommerce.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    //get All Products
    public List<ProductModel> getProducts() {
        return productRepository.findAll();
    }
    
    //get Product by Id
    public ProductModel getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    //create Product
    public ProductModel createProduct(ProductModel product) {
        return productRepository.save(product);
    }

    //update Product
    public ProductModel updateProduct(ProductModel product) {
        return productRepository.save(product);
    }

    //delete Product
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
