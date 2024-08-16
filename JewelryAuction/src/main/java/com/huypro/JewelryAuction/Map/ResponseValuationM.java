package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.ResponseValutationDTO;
import com.huypro.JewelryAuction.entity.ResponseValuationE;

public class ResponseValuationM {

    public static ResponseValutationDTO mapToDTO(ResponseValuationE responseValuation){
        return new ResponseValutationDTO(
                responseValuation.getId(),
                responseValuation.getValuationPriceMax(),
                responseValuation.getValuationPriceMin(),
                responseValuation.getTimeResponse(),
                RequestValuationM.mapToDTO(responseValuation.getRequestValuation()),
                responseValuation.getStatus()
        );
    }
    public static ResponseValuationE mapToEntityh(ResponseValutationDTO responseValutation){
        return new ResponseValuationE(
                responseValutation.getId(),
                responseValutation.getValuationPriceMax(),
                responseValutation.getValuationPriceMin(),
                responseValutation.getTimeResponse());
    }
}
