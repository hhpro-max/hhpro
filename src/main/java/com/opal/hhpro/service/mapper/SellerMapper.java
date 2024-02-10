package com.opal.hhpro.service.mapper;

import com.opal.hhpro.dto.user.SellerDTO;
import com.opal.hhpro.model.user.Seller;
import com.opal.hhpro.model.user.User;


public class SellerMapper {
    public static SellerDTO mapToDTO(Seller seller)
    {
        SellerDTO sellerDTO = (SellerDTO) UserMapper.mapToDTO(seller);
        sellerDTO.setProducts(ProductMapper.mapToDTOList(seller.getProducts()));
        sellerDTO.setCompany(CompanyMapper.mapToDTO(seller.getCompany()));

        return sellerDTO;
    }

    public static Seller mapToEntity(SellerDTO sellerDTO) {
        //TODO
        //find the solution for this line of code :
        //Seller seller = (Seller) UserMapper.mapToEntity(sellerDTO);
        User user = UserMapper.mapToEntity(sellerDTO);
        Seller seller = new Seller();
        seller.setId(user.getId());
        seller.setAddress(user.getAddress());
        seller.setEmail(user.getEmail());
        seller.setFullName(user.getFullName());
        seller.setPassword(user.getPassword());
        seller.setPhoneNumber(user.getPhoneNumber());
        seller.setRole(user.getRole());
        seller.setUsername(user.getUsername());
        seller.setCompany(CompanyMapper.mapToEntity(sellerDTO.getCompany()));
        seller.setProducts(ProductMapper.mapToEntityList(sellerDTO.getProducts()));
        return seller;
    }
}
