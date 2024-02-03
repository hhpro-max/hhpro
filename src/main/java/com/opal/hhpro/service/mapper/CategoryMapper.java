package com.opal.hhpro.service.mapper;

import com.opal.hhpro.dto.CategoryDTO;
import com.opal.hhpro.model.Category;

public class CategoryMapper {
    public static CategoryDTO mapToDTO(Category category)
    {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        return categoryDTO;
    }
    public static Category mapToEntity(CategoryDTO categoryDTO)
    {
        Category category = new Category();
        category.setId(categoryDTO.getId());
        category.setName(categoryDTO.getName());
        return category;
    }
}
