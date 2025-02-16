package com.example.ecommerce.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank(message = "name cannot be empty")
    private String name;
    private String description;

    @Min(value = 0, message = "Price must be a positive value")
    private BigDecimal price;

    public ProductModel() {
    }

    public ProductModel(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

}
