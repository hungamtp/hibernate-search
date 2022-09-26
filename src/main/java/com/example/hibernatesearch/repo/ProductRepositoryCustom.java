package com.example.hibernatesearch.repo;

import com.example.hibernatesearch.entity.Product;

import java.util.List;

public interface ProductRepositoryCustom {
    List<Product> search(String search) throws InterruptedException;
}
