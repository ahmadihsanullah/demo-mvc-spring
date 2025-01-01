package com.kelaskoding.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kelaskoding.entity.Product;

@Service
public class ProductService {
    
    private static List<Product> products = new ArrayList<>(
        Arrays.asList(
            new Product(System.currentTimeMillis(), "001", "Product 1", 50000.0),
            new Product(System.currentTimeMillis(), "002", "Product 2", 50000.0),
            new Product(System.currentTimeMillis(), "003", "Product 3", 50000.0),
            new Product(System.currentTimeMillis(), "004", "Product 4", 50000.0)
        )
    );
    

    public List<Product> findAll(){
        return products;
    }

    public void add(Product product){
        product.setId(System.currentTimeMillis());
        products.add(product);
    }
}
