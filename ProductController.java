package com.demo.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public String getProducts() {
        return "Laptop, Mobile, Headphones";
    }
}
