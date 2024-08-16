package com.huypro.JewelryAuction.dto;

import com.huypro.JewelryAuction.statusEnum.AuctionSessionStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuctionSessionDTO {

    private Integer id;
    private LocalDateTime startingBid;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String name;
    private String description;
    private String image;
    private AuctionSessionStatus status;

    public AuctionSessionDTO() {

    }

    public AuctionSessionDTO(Integer id, LocalDateTime startingBid, LocalDateTime startTime, LocalDateTime endTime, String name, String description, String image, AuctionSessionStatus status) {
        this.id = id;
        this.startingBid = startingBid;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
        this.description = description;
        this.image = image;
        this.status = status;
    }
}
