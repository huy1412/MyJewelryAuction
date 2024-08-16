package com.huypro.JewelryAuction.dto;

import com.huypro.JewelryAuction.entity.LotE;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class BidDTO {

    private long id;

    private BigDecimal price;

    private LocalDateTime time;

    private LotDTO lotDTO;

    public BidDTO() {
    }

    public BidDTO(long id, BigDecimal price, LocalDateTime time, LotDTO lotDTO) {
        this.id = id;
        this.price = price;
        this.time = time;
        this.lotDTO = lotDTO;
    }
}
