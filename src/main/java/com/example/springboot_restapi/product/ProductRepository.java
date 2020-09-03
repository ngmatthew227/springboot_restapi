package com.example.springboot_restapi.product;

import com.example.springboot_restapi.product.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}