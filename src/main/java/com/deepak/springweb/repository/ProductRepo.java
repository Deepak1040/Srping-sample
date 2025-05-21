package com.deepak.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.springweb.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}