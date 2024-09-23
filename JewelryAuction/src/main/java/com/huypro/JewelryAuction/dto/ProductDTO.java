package com.huypro.JewelryAuction.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private long id;
    private String name;
    private Float price;
    private String description;
    private String image;
    private CategoryDTO categoryDTO;
    private RequestValuationDTO requestValuationDTO;
    public ProductDTO() {
    }

    public ProductDTO(long id, String name, Float price, String description, String image, RequestValuationDTO requestValuationDTO, CategoryDTO categoryDTO) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.requestValuationDTO = requestValuationDTO;
        this.categoryDTO = categoryDTO;

    }
}
