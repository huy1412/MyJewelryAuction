package com.huypro.JewelryAuction.entity;

import com.huypro.JewelryAuction.statusEnum.RegistAuctionStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class RegistAuction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "lot_id", nullable = false)
    private LotE lot;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private RegistAuctionStatus status;


}
