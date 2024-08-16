package com.huypro.JewelryAuction.entity;

import com.huypro.JewelryAuction.statusEnum.AuctionSessionStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "auction_session")
public class AuctionSessionE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auction_session_id", nullable = false)
    private Integer id;
    @Column(name = "starting_bid")
    private LocalDateTime startingBid;
    @Column(name = "start_time")
    private LocalDateTime startTime;
    @Column(name = "end_time")
    private LocalDateTime endTime;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "description", length = 1000)
    private String description;
    @Column(name = "image", columnDefinition = "BLOB")
    private byte[] image;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private AuctionSessionStatus status;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "auctionSession")
    private List<LotE> lots;

    public AuctionSessionE() {
    }

    public AuctionSessionE(Integer id, LocalDateTime startingBid, LocalDateTime startTime, LocalDateTime endTime, String name, String description, byte[] image) {
        this.id = id;
        this.startingBid = startingBid;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
        this.description = description;
        this.image = image;
    }
}
