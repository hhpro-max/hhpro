package com.opal.hhpro.service;

import com.opal.hhpro.model.product.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductById(Long id);

}
