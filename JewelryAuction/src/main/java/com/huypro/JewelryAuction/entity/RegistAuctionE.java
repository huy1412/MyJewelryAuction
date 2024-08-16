package com.huypro.JewelryAuction.entity;

import com.huypro.JewelryAuction.statusEnum.RegistAuctionStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table
@Data
public class RegistAuctionE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "lot_id", nullable = false)
    private LotE lot;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private RegistAuctionStatus status;

    @Column(name = "previous_price", precision = 19, scale = 1)
    private BigDecimal previousPrice;

    @Column(name = "current_price", precision = 19, scale = 1)
    private BigDecimal currentPrice;

    @Column(name = "final_price", precision = 19, scale = 1)
    private BigDecimal finalPrice;

    public RegistAuctionE() {
    }

    public RegistAuctionE(long id, BigDecimal previousPrice, BigDecimal currentPrice, BigDecimal finalPrice) {
        this.id = id;
        this.previousPrice = previousPrice;
        this.currentPrice = currentPrice;
        this.finalPrice = finalPrice;
    }
}
