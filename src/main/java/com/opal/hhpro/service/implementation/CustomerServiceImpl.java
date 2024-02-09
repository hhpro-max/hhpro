package com.opal.hhpro.service.implementation;

import com.opal.hhpro.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {
    @Autowired
    CustomerRepository customerRepository;
}
