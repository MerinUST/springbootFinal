package com.ust.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {

}
