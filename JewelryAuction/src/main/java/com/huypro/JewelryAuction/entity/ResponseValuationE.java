package com.huypro.JewelryAuction.entity;

import com.huypro.JewelryAuction.statusEnum.ResponseValuationStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table
public class ResponseValuationE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private BigDecimal valuationPriceMin;
    @Column
    private BigDecimal valuationPriceMax;
    @Column
    private LocalDateTime timeResponse;
    @ManyToOne
    @JoinColumn(name = "request_valuation_id", nullable = false)
    private RequestValuationE requestValuation;
    @Enumerated(EnumType.STRING)
    @Column
    private ResponseValuationStatus status;

    public ResponseValuationE() {
    }

    public ResponseValuationE(long id, BigDecimal valuationPriceMin, BigDecimal valuationPriceMax, LocalDateTime timeResponse) {
        this.id = id;
        this.valuationPriceMin = valuationPriceMin;
        this.valuationPriceMax = valuationPriceMax;
        this.timeResponse = timeResponse;
    }
}
