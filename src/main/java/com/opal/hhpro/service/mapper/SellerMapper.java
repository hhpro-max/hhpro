package com.opal.hhpro.service.mapper;

import com.opal.hhpro.dto.user.SellerDTO;
import com.opal.hhpro.dto.user.UserDTO;
import com.opal.hhpro.model.user.Seller;

public class SellerMapper {
    public static SellerDTO mapToDTO(Seller seller)
    {
        SellerDTO sellerDTO = new SellerDTO();
        sellerDTO.setId(seller.getId());
        sellerDTO.setAddress(seller.getAddress());
        sellerDTO.setEmail(seller.getEmail());
        sellerDTO.setFullName(seller.getFullName());
        sellerDTO.setPassword(seller.getPassword());
        sellerDTO.setPhoneNumber(seller.getPhoneNumber());
        sellerDTO.setRole(seller.getRole());
        sellerDTO.setUsername(seller.getUsername());

        if(seller.getProducts() !=null && !seller.getProducts().isEmpty())
        {
            sellerDTO.setProducts(ProductMapper.mapToDTOList(seller.getProducts()));
        }
        if(seller.getCompany() != null)
        {
            sellerDTO.setCompany(CompanyMapper.mapToDTO(seller.getCompany()));
        }
        return sellerDTO;
    }

    public static Seller mapToEntity(SellerDTO seller) {

    }
}
