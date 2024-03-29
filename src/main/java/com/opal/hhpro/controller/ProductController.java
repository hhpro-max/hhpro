package com.opal.hhpro.controller;

import com.opal.hhpro.dto.produt.ProductDTO;
import com.opal.hhpro.model.product.Product;
import com.opal.hhpro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProduct();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id)
    {
        return productService.getProductById(id);
    }
    @PostMapping
    public Product createProduct(@RequestBody ProductDTO productDTO) {
        return productService.creatProduct(productDTO);
    }
}
