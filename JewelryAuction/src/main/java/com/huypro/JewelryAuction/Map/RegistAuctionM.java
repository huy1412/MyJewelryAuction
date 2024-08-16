package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.RegistAuctionDTO;
import com.huypro.JewelryAuction.entity.RegistAuctionE;

public class RegistAuctionM {

    public static RegistAuctionDTO mapToDTO(RegistAuctionE registAuction){
        return new RegistAuctionDTO(
                registAuction.getId(),
                LotM.mapToDTO(registAuction.getLot()),
                registAuction.getStatus(),
                registAuction.getPreviousPrice(),
                registAuction.getCurrentPrice(),
                registAuction.getFinalPrice()

        );
    }
    public static  RegistAuctionE mapToEntityh(RegistAuctionDTO registAuction){
        return new RegistAuctionE(
                registAuction.getId(),
                registAuction.getPreviousPrice(),
                registAuction.getCurrentPrice(),
                registAuction.getFinalPrice()
        );
    }
}
