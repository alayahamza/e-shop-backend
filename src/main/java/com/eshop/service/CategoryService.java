package com.eshop.service;

import com.eshop.model.Category;
import com.eshop.payload.CategoryPayload;
import com.eshop.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Autowired
    private ProductService productService;

    public void saveOne(Category category) {
        categoryRepository.save(category);
    }

    public List<CategoryPayload> findAll() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryPayload> categoryListPayload = new ArrayList<>();
        if (!categories.isEmpty()) {
            categoryListPayload = categories.stream().map(category -> {
                CategoryPayload categoryPayload = new CategoryPayload();
                categoryPayload.setId(category.getId());
                categoryPayload.setName(category.getName());
                categoryPayload.setDescription(category.getDescription());
                categoryPayload.setProducts(productService.getProductCountByCategory(category));
                return categoryPayload;
            }).collect(Collectors.toList());
        }
        return categoryListPayload;
    }
}
