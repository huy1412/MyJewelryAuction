package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.CategoryDTO;
import com.huypro.JewelryAuction.entity.CategoryE;

public class CategoryM {

    public static CategoryDTO mapToDTO(CategoryE category){
        return new CategoryDTO(
                category.getId(),
                category.getName()
        );
    }
    public static CategoryE mapToEntity(CategoryDTO category){
        return new CategoryE(
                category.getId(),
                category.getName()
        );
    }
}
