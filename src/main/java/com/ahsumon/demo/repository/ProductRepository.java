package com.ahsumon.demo.repository;

import com.ahsumon.demo.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> findByName(String name);
    List<Product> findByDescriptionContaining(String keyword);
}
