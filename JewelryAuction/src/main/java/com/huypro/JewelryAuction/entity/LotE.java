package com.huypro.JewelryAuction.entity;

import com.huypro.JewelryAuction.statusEnum.LotStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table
@Data
public class LotE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "current_price", precision = 19, scale = 1)
    private BigDecimal currentPrice;

    @Column(name = "start_price", precision = 19, scale = 1)
    private BigDecimal startPrice;

    @Column(name = "current_winner_id")
    private Integer currentWinnerId;

    @Column(name = "buy_now_price", precision = 19, scale = 1, nullable = true)
    private BigDecimal buyNowPrice;

    @Column(name = "price_per_step", nullable = true)
    private BigDecimal pricePerStep;

    @Column(name = "max_step")
    private Integer maxStep;
    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private ProductE product;

    @OneToMany(mappedBy = "lot", fetch = FetchType.LAZY)
    private List<BidE> bidEList;
    @Enumerated(EnumType.STRING)
    @Column
    private LotStatus status;
    @OneToMany(mappedBy = "lot", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<RegistAuctionE> registAuctionList;
    @ManyToOne
    @JoinColumn(name = "auctionsession_id", nullable = false)
    private AuctionSessionE auctionSession;

    public LotE() {
    }

    public LotE(long id, BigDecimal currentPrice, BigDecimal startPrice, Integer currentWinnerId, BigDecimal buyNowPrice, BigDecimal pricePerStep, Integer maxStep) {
        this.id = id;
        this.currentPrice = currentPrice;
        this.startPrice = startPrice;
        this.currentWinnerId = currentWinnerId;
        this.buyNowPrice = buyNowPrice;
        this.pricePerStep = pricePerStep;
        this.maxStep = maxStep;
    }
}
