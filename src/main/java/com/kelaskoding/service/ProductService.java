package com.kelaskoding.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kelaskoding.entity.Product;

@Service
public class ProductService {
    
    private static List<Product> products = Arrays.asList(
        new Product(1L, "001", "Product 1", 50000.0),
        new Product(2L, "002", "Product 2", 50000.0),
        new Product(3L, "003", "Product 3", 50000.0),
        new Product(4L, "004", "Product 4", 50000.0)
    );

    public List<Product> findAll(){
        return products;
    }
}
