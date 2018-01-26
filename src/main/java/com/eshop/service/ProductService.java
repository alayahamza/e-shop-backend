package com.eshop.service;

import com.eshop.model.Category;
import com.eshop.model.Product;
import com.eshop.payload.ProductPayload;
import com.eshop.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public void saveOne(Product product) {
        productRepository.saveAndFlush(product);
    }

    public List<ProductPayload> findAll() {
        return productRepository.findAll().stream().map(product -> convertToProductPayload(product)).collect(Collectors.toList());
    }

    public int getProductCountByCategory(Category category) {
        return productRepository.countByCategory(category);
    }

    public ProductPayload findByProductId(int productId) {
        Product product = productRepository.findOne(productId);
        if (product != null) {
            return convertToProductPayload(product);
        }
        return null;
    }

    private ProductPayload convertToProductPayload(Product product) {
        ProductPayload productPayload = new ProductPayload();
        productPayload.setId(product.getId());
        productPayload.setTitle(product.getTitle());
        productPayload.setDescription(product.getDescription());
        productPayload.setPrice(product.getPrice());
        productPayload.setRate(product.getRate());
        productPayload.setCategoryId(product.getCategory().getId());
        return productPayload;
    }
}
