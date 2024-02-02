package com.opal.hhpro.dto.user;

import com.opal.hhpro.model.product.Product;

import java.util.List;

public class CustomerDTO extends UserDTO{
    private List<Product> cart;

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }
}
