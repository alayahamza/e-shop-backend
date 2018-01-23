package com.eshop.service;

import com.eshop.model.Category;
import com.eshop.model.Product;
import com.eshop.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public void saveOne(Product product) {
        productRepository.saveAndFlush(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public int getProductCountByCategory(Category category) {
        return productRepository.countByCategory(category);
    }
}
