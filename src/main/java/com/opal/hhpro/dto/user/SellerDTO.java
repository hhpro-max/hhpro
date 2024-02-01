package com.opal.hhpro.dto.user;




import com.opal.hhpro.dto.CompanyDTO;
import com.opal.hhpro.dto.produt.ProductDTO;

import java.util.List;

public class SellerDTO extends UserDTO{
    private CompanyDTO company;
    private List<ProductDTO> products;

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }
}
