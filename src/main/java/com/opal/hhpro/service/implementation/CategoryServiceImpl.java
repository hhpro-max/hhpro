package com.opal.hhpro.service.implementation;

import com.opal.hhpro.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl {
    @Autowired
    CategoryRepository categoryRepository;
}
