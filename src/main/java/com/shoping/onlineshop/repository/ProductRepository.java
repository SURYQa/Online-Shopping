package com.shoping.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoping.onlineshop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
    Product findById(long Id);
}
