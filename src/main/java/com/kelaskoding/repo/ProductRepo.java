package com.kelaskoding.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kelaskoding.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findByNameContains(String keyword );
}
