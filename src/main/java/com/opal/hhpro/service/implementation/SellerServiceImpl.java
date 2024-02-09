package com.opal.hhpro.service.implementation;

import com.opal.hhpro.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl {
    @Autowired
    SellerRepository sellerRepository;
}
