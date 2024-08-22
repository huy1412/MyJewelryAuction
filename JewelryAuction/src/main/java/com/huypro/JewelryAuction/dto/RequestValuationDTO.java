package com.huypro.JewelryAuction.dto;

import com.huypro.JewelryAuction.statusEnum.RequestValuationStatus;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data

public class RequestValuationDTO {
    private long id;
    private LocalDateTime timeRequest;
    private BigDecimal estimatePriceMax;
    private String description;
    private String image;
    private RequestValuationStatus status;

    public RequestValuationDTO() {

    }

    public RequestValuationDTO(long id, LocalDateTime timeRequest, BigDecimal estimatePriceMax, String description, String image, RequestValuationStatus status) {
        this.id = id;
        this.timeRequest = timeRequest;
        this.estimatePriceMax = estimatePriceMax;

        this.description = description;
        this.image = image;
        this.status = status;
    }
}
