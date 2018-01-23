package com.eshop.repository;

import com.eshop.model.Category;
import com.eshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface IProductRepository extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Product> {
    int countByCategory(Category category);
}
