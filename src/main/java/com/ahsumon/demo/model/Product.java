package com.ahsumon.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


    @Document(indexName = "products")
    @Data                 // Generates getters, setters, toString, equals, hashCode
    @NoArgsConstructor    // Generates no-args constructor
    @AllArgsConstructor   // Generates all-args constructor

    public class Product {

        @Id
        private String id;
        private String name;
        private String description;
        private double price;


    }

