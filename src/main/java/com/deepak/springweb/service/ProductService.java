package com.deepak.springweb.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.deepak.springweb.model.Product;
import com.deepak.springweb.repository.ProductRepo;

@Component
public class ProductService {

    @Autowired
    ProductRepo repo;

    //List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "Phone", 25),new Product(2, "Laptop", 500),new Product(3, "Charger", 100),new Product(4, "Tab", 300)));

    public List<Product> getProducts()
    {
        return repo.findAll();
    }

    public Product getProductById(int proId) {
        
        return repo.findById(proId).orElse(new Product());
        
    }

    public void addProduct(@RequestBody Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int proId) {
        repo.deleteById(proId);
    }

}
