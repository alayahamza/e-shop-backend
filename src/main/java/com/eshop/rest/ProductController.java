package com.eshop.rest;

import com.eshop.model.Product;
import com.eshop.payload.ProductPayload;
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
    public ProductPayload saveProduct(@RequestBody ProductPayload product) {
        return productService.saveOne(product);
    }

    @PatchMapping
    public ProductPayload updateProduct(@RequestBody ProductPayload product) {
        return productService.updateProduct(product);
    }

    @GetMapping
    public List<ProductPayload> getProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductPayload getProductById(@PathVariable("id") int id) {
        return productService.findByProductId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") int id) {
        productService.deleteProduct(id);
    }
}
