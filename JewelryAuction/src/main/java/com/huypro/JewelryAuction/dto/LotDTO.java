package com.huypro.JewelryAuction.dto;

import com.huypro.JewelryAuction.entity.BidE;
import com.huypro.JewelryAuction.entity.ProductE;
import com.huypro.JewelryAuction.statusEnum.LotStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class LotDTO {
    private long id;
    private BigDecimal currentPrice;
    private BigDecimal startPrice;
    private Integer currentWinnerId;
    private BigDecimal buyNowPrice;
    private BigDecimal pricePerStep;
    private Integer maxStep;
    private ProductDTO product;
    private LotStatus status;

    public LotDTO() {
    }

    public LotDTO(long id, BigDecimal currentPrice, BigDecimal startPrice, Integer currentWinnerId, BigDecimal buyNowPrice, BigDecimal pricePerStep, Integer maxStep, ProductDTO product, LotStatus status) {
        this.id = id;
        this.currentPrice = currentPrice;
        this.startPrice = startPrice;
        this.currentWinnerId = currentWinnerId;
        this.buyNowPrice = buyNowPrice;
        this.pricePerStep = pricePerStep;
        this.maxStep = maxStep;
        this.product = product;
        this.status = status;
    }
}
