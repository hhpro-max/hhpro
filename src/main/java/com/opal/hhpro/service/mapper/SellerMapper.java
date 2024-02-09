package com.opal.hhpro.service.mapper;

import com.opal.hhpro.dto.user.SellerDTO;
import com.opal.hhpro.model.user.Seller;

public class SellerMapper {
    public static SellerDTO mapToDTO(Seller seller)
    {
        SellerDTO sellerDTO = (SellerDTO) UserMapper.mapToDTO(seller);
        sellerDTO.setProducts(ProductMapper.mapToDTOList(seller.getProducts()));
        sellerDTO.setCompany(CompanyMapper.mapToDTO(seller.getCompany()));

        return sellerDTO;
    }

    public static Seller mapToEntity(SellerDTO sellerDTO) {
        Seller seller = (Seller) UserMapper.mapToEntity(sellerDTO);
        seller.setCompany(CompanyMapper.mapToEntity(sellerDTO.getCompany()));
        seller.setProducts(ProductMapper.mapToEntityList(sellerDTO.getProducts()));
        return seller;
    }
}
