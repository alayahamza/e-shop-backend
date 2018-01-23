package com.eshop.rest;

import com.eshop.model.Category;
import com.eshop.payload.CategoryPayload;
import com.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping
    public void saveCategory(@RequestBody Category category) {
        categoryService.saveOne(category);
    }

    @GetMapping
    public List<CategoryPayload> getCategories() {
        return categoryService.findAll();
    }
}
