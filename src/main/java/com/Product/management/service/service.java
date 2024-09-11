package com.Product.management.service;

import java.util.List;

import com.Product.management.model.Product;

public interface service {

    public Product saveProduct(Product product);

    public List<Product> getAllProduct();

    public Product getProductById(Integer id);

    public void deleteProduct(Integer id);

    public Product updateProduct(Product product, Integer id);

}
