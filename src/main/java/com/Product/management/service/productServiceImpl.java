package com.Product.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.management.model.Product;
import com.Product.management.repository.repository;

@Service
public class productServiceImpl implements service {
    @Autowired
    private repository repo;

    @Override
    public void deleteProduct(Integer id) {
        Product product = repo.findById(id).get();
        if (product != null) {
            repo.delete(product);
        }

    }

    @Override
    public List<Product> getAllProduct() {

        return repo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {

        return repo.findById(id).get();
    }

    @Override
    public Product saveProduct(Product product) {

        return repo.save(product);
    }

    @Override
    public Product updateProduct(Product product, Integer id) {
        Product oldProduct = repo.findById(id).get();

        if (oldProduct != null) {
            product.setId(id);
            return repo.save(product);
        }
        return null;

    }

}
