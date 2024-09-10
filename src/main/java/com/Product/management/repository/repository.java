package com.Product.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Product.management.model.Product;

public interface repository extends JpaRepository<Product, Integer> {

    // class and id

}
