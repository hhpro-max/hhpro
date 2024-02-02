package com.opal.hhpro.repository;

import com.opal.hhpro.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
