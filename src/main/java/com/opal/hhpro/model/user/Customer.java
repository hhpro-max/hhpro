package com.opal.hhpro.model.user;

import com.opal.hhpro.model.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer extends User{
    @OneToMany
    private List<Product> cart;

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }
}
