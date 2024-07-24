package com.huypro.JewelryAuction.dto;

import com.huypro.JewelryAuction.statusEnum.RequestValuationStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class ValuationRequest {
    private long id;
    private LocalDateTime timeRequest;
    private RequestValuationStatus status;
    private BigDecimal estimatePriceMax;
    private BigDecimal estimatePriceMin;
    private String description;
    private ProductDTO productDTO;

    public ValuationRequest() {
    }

    public ValuationRequest(long id, LocalDateTime timeRequest, RequestValuationStatus status, BigDecimal estimatePriceMax, BigDecimal estimatePriceMin, String description, ProductDTO productDTO) {
        this.id = id;
        this.timeRequest = timeRequest;
        this.status = status;
        this.estimatePriceMax = estimatePriceMax;
        this.estimatePriceMin = estimatePriceMin;
        this.description = description;
        this.productDTO = productDTO;
    }
}
