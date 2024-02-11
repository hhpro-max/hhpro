package com.opal.hhpro;

import com.opal.hhpro.model.Category;
import com.opal.hhpro.model.user.Seller;
import com.opal.hhpro.repository.CategoryRepository;
import com.opal.hhpro.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    SellerRepository sellerRepository;
    @Override
    public void run(String... args) throws Exception {
        Category category = new Category();
        category.setName("nut");
        categoryRepository.save(category);
        Seller seller = new Seller();


        seller.setUsername("admin");
        seller.setPassword("admin");
        sellerRepository.save(seller);
    }
    //todo get ride of this mapping and make it work thanks xd
    /*
    {
    "name" : "cos",
    "imageURL" : "http://coint/sleep",
    "generalDescription" : "this is test description of my product ",
    "category" :
    {
        "id": 1,
        "name" : "nut"
    },
    "seller":
    {
        "id":1,
        "name" : "hossein",
        "company":
        {

            "name" : "opal"
        }
    },
    "price" : 10.0
}
     */
}
