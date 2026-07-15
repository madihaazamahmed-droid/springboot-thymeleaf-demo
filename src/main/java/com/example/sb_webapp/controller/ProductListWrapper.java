package com.example.sb_webapp.controller;

import java.util.List;

import com.example.sb_webapp.entity.Product;

public class ProductListWrapper {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
