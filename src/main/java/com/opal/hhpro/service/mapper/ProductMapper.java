package com.opal.hhpro.service.mapper;

import com.opal.hhpro.dto.produt.ProductDTO;
import com.opal.hhpro.model.product.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {
    public static List<ProductDTO> mapToDTOList(List<Product> products)
    {
        try
        {
            return products.stream()
                    .map(ProductMapper::mapToDTO)
                    .collect(Collectors.toList());
        }catch (Exception e)
        {
            return null;
        }
    }
    public static ProductDTO mapToDTO(Product product)
    {
        try
        {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setSeller(SellerMapper.mapToDTO(product.getSeller()));
            productDTO.setCategory(CategoryMapper.mapToDTO(product.getCategory()));
            productDTO.setId(product.getId());
            productDTO.setName(product.getName());
            productDTO.setPrice(product.getPrice());
            productDTO.setImageURL(product.getImageURL());
            productDTO.setGeneralDescription(product.getGeneralDescription());
            return productDTO;
        }catch (Exception e)
        {
            return null;
        }
    }
    public static List<Product> mapToEntityList(List<ProductDTO> productDTOs) {
        try
        {
            return productDTOs.stream()
                    .map(ProductMapper::mapToEntity)
                    .collect(Collectors.toList());
        }catch (Exception e)
        {
            return null;
        }
    }
    public static Product mapToEntity(ProductDTO productDTO)
    {
        try{
            Product product = new Product();
            product.setCategory(CategoryMapper.mapToEntity(productDTO.getCategory()));
            product.setSeller(SellerMapper.mapToEntity(productDTO.getSeller()));
            product.setId(productDTO.getId());
            product.setName(productDTO.getName());
            product.setPrice(productDTO.getPrice());
            product.setImageURL(productDTO.getImageURL());
            product.setGeneralDescription(productDTO.getGeneralDescription());
            return product;
        }catch (Exception e)
        {
            return null;
        }
    }
}
