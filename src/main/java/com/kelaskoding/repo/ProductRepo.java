package com.kelaskoding.repo;

import org.springframework.data.repository.CrudRepository;

import com.kelaskoding.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
    
}
