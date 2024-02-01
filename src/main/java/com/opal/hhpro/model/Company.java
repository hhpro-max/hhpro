package com.opal.hhpro.model;

import com.opal.hhpro.model.user.User;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;
    @OneToMany
    private List<User> users;

}
