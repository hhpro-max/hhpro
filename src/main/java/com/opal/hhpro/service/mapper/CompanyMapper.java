package com.opal.hhpro.service.mapper;

import com.opal.hhpro.dto.CompanyDTO;
import com.opal.hhpro.dto.user.SellerDTO;
import com.opal.hhpro.model.Company;
import com.opal.hhpro.model.user.Seller;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyMapper {
    public static CompanyDTO mapToDTO(Company company) {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setId(company.getId());
        companyDTO.setName(company.getName());
        companyDTO.setAddress(company.getAddress());
        companyDTO.setPhoneNumber(company.getPhoneNumber());
        companyDTO.setSellers(CompanyMapper.mapToDTOList(company.getSellers()));
        return companyDTO;
    }

    private static List<SellerDTO> mapToDTOList(List<Seller> sellers) {
        return sellers.stream()
                .map(SellerMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    public static Company mapToEntity(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setSellers(CompanyMapper.mapToEntityList(companyDTO.getSellers()));
        company.setAddress(companyDTO.getAddress());
        company.setId(companyDTO.getId());
        company.setPhoneNumber(companyDTO.getPhoneNumber());
        company.setName(companyDTO.getName());
        return company;
    }

    private static List<Seller> mapToEntityList(List<SellerDTO> sellers) {
        return sellers.stream()
                .map(SellerMapper::mapToEntity)
                .collect(Collectors.toList());
    }
}
