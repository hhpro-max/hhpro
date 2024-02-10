package com.opal.hhpro.service.mapper;

import com.opal.hhpro.dto.CompanyDTO;
import com.opal.hhpro.dto.user.SellerDTO;
import com.opal.hhpro.model.Company;
import com.opal.hhpro.model.user.Seller;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyMapper {
    public static CompanyDTO mapToDTO(Company company) {
        try
        {
            CompanyDTO companyDTO = new CompanyDTO();
            companyDTO.setId(company.getId());
            companyDTO.setName(company.getName());
            companyDTO.setAddress(company.getAddress());
            companyDTO.setPhoneNumber(company.getPhoneNumber());
            companyDTO.setSellers(CompanyMapper.mapToDTOList(company.getSellers()));
            return companyDTO;
        }catch (Exception e)
        {
            return null;
        }
    }

    private static List<SellerDTO> mapToDTOList(List<Seller> sellers) {
        try {
            return sellers.stream()
                    .map(SellerMapper::mapToDTO)
                    .collect(Collectors.toList());
        }catch (Exception e)
        {
            return null;
        }
    }

    public static Company mapToEntity(CompanyDTO companyDTO) {
        try {
            Company company = new Company();
            company.setSellers(CompanyMapper.mapToEntityList(companyDTO.getSellers()));
            company.setAddress(companyDTO.getAddress());
            company.setId(companyDTO.getId());
            company.setPhoneNumber(companyDTO.getPhoneNumber());
            company.setName(companyDTO.getName());
            return company;
        }
        catch (Exception e)
        {
            return null;
        }
    }

    private static List<Seller> mapToEntityList(List<SellerDTO> sellers) {
        try {
            return sellers.stream()
                    .map(SellerMapper::mapToEntity)
                    .collect(Collectors.toList());
        }catch (Exception e)
        {
            return null;
        }
    }
}
