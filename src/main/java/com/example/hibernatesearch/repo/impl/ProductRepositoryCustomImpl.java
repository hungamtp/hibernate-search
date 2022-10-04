package com.example.hibernatesearch.repo.impl;

import com.example.hibernatesearch.entity.Product;
import com.example.hibernatesearch.entity.Product_;
import com.example.hibernatesearch.repo.ProductRepositoryCustom;
import lombok.AllArgsConstructor;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.CriteriaImpl;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@AllArgsConstructor
@Repository("Repo1")
public class ProductRepositoryCustomImpl implements ProductRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> searchByKeyWord(String search) throws InterruptedException {
        FullTextEntityManager fullTextEntityManager
            = Search.getFullTextEntityManager(entityManager);
        fullTextEntityManager.createIndexer()
            .startAndWait();
        int indexSize = fullTextEntityManager.getSearchFactory()
            .getStatistics()
            .getNumberOfIndexedEntities(Product.class.getName());
        System.out.println(indexSize);
        QueryBuilder queryBuilder = fullTextEntityManager.getSearchFactory()
            .buildQueryBuilder()
            .forEntity(Product.class)
            .get();

        org.apache.lucene.search.Query query = queryBuilder
            .keyword()
            .fuzzy()
            .withEditDistanceUpTo(2)
            .withPrefixLength(0)
            .onField(Product_.DESCRIPTION)
            .andField(Product_.NAME)
            .matching(search)
            .createQuery()
            ;

        org.hibernate.search.jpa.FullTextQuery jpaQuery
            = fullTextEntityManager
            .createFullTextQuery(query, Product.class);


        List<Product> results = jpaQuery.getResultList();
        return results;
    }

}
