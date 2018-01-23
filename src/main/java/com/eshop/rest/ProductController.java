package com.eshop.rest;

import com.eshop.model.Product;
import com.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public void saveProduct(@RequestBody Product product) {
        productService.saveOne(product);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.findAll();
    }
}
