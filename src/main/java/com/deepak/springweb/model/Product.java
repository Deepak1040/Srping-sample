package com.deepak.springweb.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {
    
    @Id
    private int proId;
    private String proName;
    private int proPrice;

    public int getProId() {
        return proId;
    }
    public void setProId(int proId) {
        this.proId = proId;
    }
    public String getProName() {
        return proName;
    }
    public void setProName(String proName) {
        this.proName = proName;
    }
    public int getProPrice() {
        return proPrice;
    }
    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }
    @Override
    public String toString() {
        return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
    }
    public Product(int proId, String proName, int proPrice) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
    }
    
    public Product() {}
}
