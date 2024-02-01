package com.opal.hhpro.dto;


import com.opal.hhpro.dto.user.SellerDTO;

import java.util.List;

public class CompanyDTO {
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;

    private List<SellerDTO> sellers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<SellerDTO> getSellers() {
        return sellers;
    }

    public void setSellers(List<SellerDTO> sellers) {
        this.sellers = sellers;
    }
}
