package com.kelaskoding.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelaskoding.entity.Product;
import com.kelaskoding.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;
    
    public List<Product> findAll(){
        return (List<Product>) repo.findAll();
    }

    public void add(Product product){
        repo.save(product);
    }

    public void deleteById(Long id){
        repo.deleteById(id);
    }

    public Optional<Product> findById(Long id){
        return repo.findById(id);
    }

    public void updateProduct(Product product){
        repo.save(product);
    }
}