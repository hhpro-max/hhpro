package com.opal.hhpro.repository;

import com.opal.hhpro.model.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
