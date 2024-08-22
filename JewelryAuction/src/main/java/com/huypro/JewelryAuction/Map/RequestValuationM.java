package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.RequestValuationDTO;
import com.huypro.JewelryAuction.entity.RequestValuationE;

import java.util.Base64;


public class RequestValuationM {

    public static RequestValuationDTO mapToDTO(RequestValuationE requestValuation){
        String encodedImage = requestValuation.getImage() != null
                ? Base64.getEncoder().encodeToString(requestValuation.getImage())
                : null;
        return new RequestValuationDTO(
                requestValuation.getId(),
                requestValuation.getTimeRequest(),
                requestValuation.getEstimatePriceMax(),
                requestValuation.getDescription(),
                encodedImage,
                requestValuation.getStatus()
        );
    }
    public static RequestValuationE mapToEntity(RequestValuationDTO requestValuationDTO){
        byte[] decodedImage = requestValuationDTO.getImage() != null
                ? Base64.getDecoder().decode(requestValuationDTO.getImage())
                : null;
        return new RequestValuationE(
                requestValuationDTO.getId(),
                requestValuationDTO.getEstimatePriceMax(),
                requestValuationDTO.getDescription(),
                decodedImage,
                requestValuationDTO.getStatus()
        );
    }
}
