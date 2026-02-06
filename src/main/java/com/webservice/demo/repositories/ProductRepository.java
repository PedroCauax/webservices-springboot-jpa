package com.webservice.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.demo.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}