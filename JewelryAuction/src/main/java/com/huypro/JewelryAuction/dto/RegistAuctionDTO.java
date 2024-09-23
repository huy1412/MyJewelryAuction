package com.huypro.JewelryAuction.dto;

import com.huypro.JewelryAuction.statusEnum.RegistAuctionStatus;
import lombok.Data;


import java.math.BigDecimal;

@Data
public class RegistAuctionDTO {

    private long id;


    private LotDTO lot;


    private RegistAuctionStatus status;

    private BigDecimal previousPrice;

    private BigDecimal currentPrice;

    private BigDecimal finalPrice;

    public RegistAuctionDTO() {
    }

    public RegistAuctionDTO(long id, LotDTO lot, RegistAuctionStatus status, BigDecimal previousPrice, BigDecimal currentPrice, BigDecimal finalPrice) {
        this.id = id;
        this.lot = lot;
        this.status = status;
        this.previousPrice = previousPrice;
        this.currentPrice = currentPrice;
        this.finalPrice = finalPrice;
    }
}
