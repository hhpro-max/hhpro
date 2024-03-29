package com.opal.hhpro.service.implementation;

import com.opal.hhpro.dto.produt.ProductDTO;
import com.opal.hhpro.model.product.Product;
import com.opal.hhpro.repository.ProductRepository;
import com.opal.hhpro.service.ProductService;
import com.opal.hhpro.service.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {

        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product creatProduct(ProductDTO productDTO) {
        return productRepository.save(ProductMapper.mapToEntity(productDTO));
    }
}
