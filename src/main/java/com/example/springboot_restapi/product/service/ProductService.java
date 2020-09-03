package com.example.springboot_restapi.product.service;

import java.util.List;
import java.util.Optional;

import com.example.springboot_restapi.product.ProductRepository;
import com.example.springboot_restapi.product.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRes;

    public List<Product> findAll() {
        return productRes.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRes.findById(id);
    }

    public Product save(Product stock) {
        return productRes.save(stock);
    }

    public void deleteById(Long id) {
        productRes.deleteById(id);
    }
}