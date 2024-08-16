package com.huypro.JewelryAuction.dto;

import com.huypro.JewelryAuction.entity.RequestValuationE;
import com.huypro.JewelryAuction.statusEnum.ResponseValuationStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ResponseValutationDTO {

    private long id;
    private BigDecimal valuationPriceMin;
    private BigDecimal valuationPriceMax;
    private LocalDateTime timeResponse;
    private RequestValuationDTO requestValuation;
    private ResponseValuationStatus status;

    public ResponseValutationDTO() {
    }

    public ResponseValutationDTO(long id, BigDecimal valuationPriceMin, BigDecimal valuationPriceMax, LocalDateTime timeResponse, RequestValuationDTO requestValuation, ResponseValuationStatus status) {
        this.id = id;
        this.valuationPriceMin = valuationPriceMin;
        this.valuationPriceMax = valuationPriceMax;
        this.timeResponse = timeResponse;
        this.requestValuation = requestValuation;
        this.status = status;
    }
}
