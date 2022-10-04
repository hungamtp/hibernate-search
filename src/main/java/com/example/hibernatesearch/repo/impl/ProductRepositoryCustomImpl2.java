package com.example.hibernatesearch.repo.impl;

import com.example.hibernatesearch.entity.Product;
import com.example.hibernatesearch.repo.ProductRepositoryCustom;
import org.hibernate.search.MassIndexer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("Repo2")
public class ProductRepositoryCustomImpl2 implements ProductRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Product> searchByKeyWord(String search) throws InterruptedException {

        return null;
    }
}
