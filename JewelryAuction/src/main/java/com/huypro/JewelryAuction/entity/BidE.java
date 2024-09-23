package com.huypro.JewelryAuction.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table
@Data
public class BidE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private BigDecimal price;
    @Column
    private LocalDateTime time;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "lot_id", nullable = false)
    private LotE lot;

    public BidE() {
    }

    public BidE(long id, BigDecimal price, LocalDateTime time) {
        this.id = id;
        this.price = price;
        this.time = time;
    }
}
