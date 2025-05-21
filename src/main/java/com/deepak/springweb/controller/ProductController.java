package com.deepak.springweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.springweb.model.Product;
import com.deepak.springweb.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class ProductController {


    @Autowired    
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProduct()
    {
        return service.getProducts();
    }
    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId)
    {
        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        service.addProduct(prod);
    }


    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{proId}")
    public void deleteProduct(@PathVariable int proId)
    {
        service.deleteProduct(proId);
    }


}
