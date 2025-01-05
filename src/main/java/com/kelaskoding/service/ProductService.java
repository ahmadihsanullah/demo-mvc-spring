package com.kelaskoding.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.apple.laf.resources.aqua;
import com.kelaskoding.entity.Product;
import com.kelaskoding.utils.RandomNumber;

@Service
public class ProductService {
    
    private static List<Product> products = new ArrayList<>(
        Arrays.asList(
            new Product(RandomNumber.getRandom(1000, 9999), "001", "Product 1", 50000.0),
            new Product(RandomNumber.getRandom(1000, 9999), "002", "Product 2", 40000.0),
            new Product(RandomNumber.getRandom(1000, 9999), "003", "Product 3", 60000.0),
            new Product(RandomNumber.getRandom(1000, 9999), "004", "Product 4", 55000.0)
        )
    );
    

    public List<Product> findAll(){
        return products;
    }

    public void add(Product product){
        product.setId(RandomNumber.getRandom(1000, 9999));
        products.add(product);
    }

    public void deleteById(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public Optional<Product> findById(Long id){
        return products.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    public void updateProduct(Product product){
        deleteById(product.getId());
        add(product);
    }
}
