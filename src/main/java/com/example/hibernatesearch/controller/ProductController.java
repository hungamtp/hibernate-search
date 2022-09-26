package com.example.hibernatesearch.controller;

import com.example.hibernatesearch.entity.Product;
import com.example.hibernatesearch.repo.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity get(@RequestBody String search) throws InterruptedException {
        return ResponseEntity.ok().body(productRepository.search(search));
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Product product) {
        return ResponseEntity.ok().body(productRepository.save(product));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Product product) {
        return ResponseEntity.ok().body(productRepository.save(product));
    }
}
