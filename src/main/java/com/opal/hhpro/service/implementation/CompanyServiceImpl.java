package com.opal.hhpro.service.implementation;

import com.opal.hhpro.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl {
    @Autowired
    CompanyRepository companyRepository;
}
