package com.huypro.JewelryAuction.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    private long id;
    private String name;


    public CategoryDTO() {
    }

    public CategoryDTO(long id, String name) {
        this.id = id;
        this.name = name;

    }
}
