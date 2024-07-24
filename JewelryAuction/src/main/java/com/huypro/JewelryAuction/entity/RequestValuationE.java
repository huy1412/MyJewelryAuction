package com.huypro.JewelryAuction.entity;
import java.math.BigDecimal;
import com.huypro.JewelryAuction.statusEnum.ValuationRequestStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
public class ValuationRequestE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private LocalDateTime timeRequest;
    @Column
    private ValuationRequestStatus status;
    @Column
    private BigDecimal estimatePriceMax;
    @Column
    private BigDecimal estimatePriceMin;
    @Column
    private String description;
    @Column
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_id")
    private ProductE productE;

    public ValuationRequestE() {
    }

    public ValuationRequestE(long id, LocalDateTime timeRequest, BigDecimal estimatePriceMax, BigDecimal estimatePriceMin, String description) {
        this.id = id;
        this.timeRequest = timeRequest;
        this.estimatePriceMax = estimatePriceMax;
        this.estimatePriceMin = estimatePriceMin;
        this.description = description;
    }
}
