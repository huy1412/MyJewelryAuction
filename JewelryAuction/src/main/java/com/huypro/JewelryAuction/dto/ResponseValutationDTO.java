package com.huypro.JewelryAuction.dto;

import com.huypro.JewelryAuction.entity.RequestValuationE;
import com.huypro.JewelryAuction.statusEnum.ResponseValuationStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class ResponseValutation {

    private long id;
    private BigDecimal valuationPriceMin;
    private BigDecimal valuationPriceMax;
    private LocalDateTime timeResponse;
    private RequestValuationE requestValuation;
    private ResponseValuationStatus status;

    public ResponseValutation() {
    }

    public ResponseValutation(long id, BigDecimal valuationPriceMin, BigDecimal valuationPriceMax, LocalDateTime timeResponse, RequestValuationE requestValuation, ResponseValuationStatus status) {
        this.id = id;
        this.valuationPriceMin = valuationPriceMin;
        this.valuationPriceMax = valuationPriceMax;
        this.timeResponse = timeResponse;
        this.requestValuation = requestValuation;
        this.status = status;
    }
}
