package com.eshop.service;

import com.eshop.model.Category;
import com.eshop.repository.ICategoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//TODO uncomment those lines when working with another data base other than H2 in main context
//@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
//@Sql(scripts = "/import-data.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
public class CategoryServiceTest {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Test
    public void saveOne() {
//        int id = 10000;
//        Category category = new Category();
//        category.setId(id);
//        category.setName("Category 1");
//        category.setDescription("Category 1 description");
//        categoryRepository.save(category);
//
//        Category savedCategory = categoryRepository.findOne(id);
//        Assert.assertNotNull(savedCategory);
//        Assert.assertEquals(savedCategory.getId(), id);

    }

    @Test
    public void findAll() {
//        List<Category> categories = categoryRepository.findAll();
//        Assert.assertEquals(categories.size(), 4);
    }
}