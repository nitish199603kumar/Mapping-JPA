package com.nitish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitish.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
