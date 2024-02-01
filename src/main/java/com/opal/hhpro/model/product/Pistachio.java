package com.opal.hhpro.model.product;

import jakarta.persistence.Entity;

@Entity
public class Pistachio extends Product{
    private String type;
    private String origin;
    private double purity;
    private String fullDescription;

}
