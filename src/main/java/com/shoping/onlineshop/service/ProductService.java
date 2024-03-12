package com.shoping.onlineshop.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.shoping.onlineshop.entity.Product;
import com.shoping.onlineshop.repository.ProductRepository;
import jakarta.annotation.PostConstruct;


@Service
public class ProductService {

   private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @PostConstruct
    public void seedData() {
        long existing = productRepository.count();
        
        for (int i = 1; i <= 16; i++) {
            if(existing != 16 ){
            Product product = new Product();
            product.setName("Product-" + i);
            product.setDescription("Description for Product " + i);
            product.setPrice(10.0 * i); 
            productRepository.save(product);
            }
        }
    }
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

public Product getProductById(Long productId) {
       return productRepository.findById(productId).orElse(null);
    }
    

   


}