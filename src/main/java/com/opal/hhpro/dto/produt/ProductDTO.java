package com.opal.hhpro.dto.produt;


import com.opal.hhpro.dto.CategoryDTO;
import com.opal.hhpro.dto.user.SellerDTO;
import com.opal.hhpro.dto.user.UserDTO;

public class ProductDTO {
    private Long id;
    private String name;
    private String imageURL;
    private String generalDescription;
    private double price;

    private CategoryDTO category;
    private SellerDTO seller;


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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getGeneralDescription() {
        return generalDescription;
    }

    public void setGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public SellerDTO getSeller() {
        return seller;
    }

    public void setSeller(SellerDTO user) {
        this.seller = user;
    }
}
