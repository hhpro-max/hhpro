package com.opal.hhpro.model.user;

import com.opal.hhpro.model.Company;
import com.opal.hhpro.model.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;


@Entity
public class Seller extends User{

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToMany
    private List<Product> products;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
