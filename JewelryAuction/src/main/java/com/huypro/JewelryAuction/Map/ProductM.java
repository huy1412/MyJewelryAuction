package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.ProductDTO;
import com.huypro.JewelryAuction.entity.ProductE;
import java.util.Base64;

public class ProductM {

    public static ProductDTO mapToDTO(ProductE product) {
        String encodedImage = product.getImage() != null ? Base64.getEncoder().encodeToString(product.getImage()) : null;
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription(),
                encodedImage,
                RequestValuationM.mapToDTO(product.getRequestValuationE()),
                CategoryM.mapToDTO(product.getCategoryE())


        );
    }
    public static ProductE mapToEntity(ProductDTO product) {

        byte[] decodedImage = product.getImage() != null ? Base64.getDecoder().decode(product.getImage()) : null;

        return new ProductE(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription(),
                decodedImage,
                RequestValuationM.mapToEntity(product.getRequestValuationDTO()),
                CategoryM.mapToEntity(product.getCategoryDTO())


         );
    }
}
