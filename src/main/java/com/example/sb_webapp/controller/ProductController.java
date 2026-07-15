package com.example.sb_webapp.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sb_webapp.entity.Product;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ProductController {

    private List<Product> products = new ArrayList<>();

    // GET mappings
    @GetMapping("/hi")
    public String returnDynamic() {
        return "defdynamic.html";
    }

    @GetMapping("/hello")
    public String returnDynamic1() {
        return "pqrdynamic.html";
    }

    // INSERT single product
    @PostMapping("/pi")
    @ResponseBody
    public String insertProduct(@ModelAttribute Product product) {
        products.add(product);
        System.out.println("Inserted : " + product);
        return "data inserted";
    }

    // INSERT ALL (requires wrapper or JSON body for real use)
    @PostMapping("/pia")
    @ResponseBody
    public String insertAll(@ModelAttribute ProductListWrapper productListWrapper) {
        products.addAll(productListWrapper.getProducts());
        System.out.println("All Products Inserted");
        return "all data inserted";
    }

    // PATCH
    @PatchMapping("/pp")
    @ResponseBody
    public String patchProduct(@ModelAttribute Product product) {
        System.out.println("Patched Product : " + product);
        return "product patched";
    }

    // PUT
    @PutMapping("/pu")
    @ResponseBody
    public String updateProduct(@ModelAttribute Product product) {
        System.out.println("Updated Product : " + product);
        return "product updated";
    }

    // DELETE ALL
    @DeleteMapping("/pda")
    @ResponseBody
    public String deleteAllProducts() {
        products.clear();
        System.out.println("All Products Deleted");
        return "all products deleted";
    }
}
