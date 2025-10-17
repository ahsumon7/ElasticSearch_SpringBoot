package com.ahsumon.demo.service;

import com.ahsumon.demo.model.Product;
import com.ahsumon.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> searchByName(String name) {
        return productRepository.findByName(name);
    }

    public List<Product> searchByDescription(String keyword) {
        return productRepository.findByDescriptionContaining(keyword);
    }
}
