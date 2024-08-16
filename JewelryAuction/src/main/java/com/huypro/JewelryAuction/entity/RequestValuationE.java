package com.huypro.JewelryAuction.entity;

import java.math.BigDecimal;

import com.huypro.JewelryAuction.statusEnum.RequestValuationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "requestValuatione")
public class RequestValuationE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private LocalDateTime timeRequest;
    @Column
    private BigDecimal estimatePriceMax;
    @Column
    private BigDecimal estimatePriceMin;
    @Column
    private String description;

    @Lob
    @Column(name = "image", columnDefinition = "BLOB",length = 1000)
    private byte[] image;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private ProductE productE;

    @OneToMany(mappedBy = "requestValuation", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ResponseValuationE> responseValuationEList;

    @Enumerated(EnumType.STRING)
    @Column
    private RequestValuationStatus status;
    public RequestValuationE() {

    }

    public RequestValuationE(long id, BigDecimal estimatePriceMax, BigDecimal estimatePriceMin, String description, byte[] image, RequestValuationStatus status) {
        this.id = id;
        this.timeRequest = timeRequest.now();
        this.estimatePriceMax = estimatePriceMax;
        this.estimatePriceMin = estimatePriceMin;
        this.description = description;
        this.image = image;
        this.status = status;
    }
}