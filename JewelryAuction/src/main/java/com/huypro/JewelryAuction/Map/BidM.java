package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.BidDTO;
import com.huypro.JewelryAuction.entity.BidE;

public class BidM {

    public static BidDTO mapToDTO(BidE bid){
        return new BidDTO(
                bid.getId(),
                bid.getPrice(),
                bid.getTime(),
                LotM.mapToDTO(bid.getLot())
        );
    }
    public static BidE mapToDTO(BidDTO bid){
        return new BidE (
                bid.getId(),
                bid.getPrice(),
                bid.getTime()
        );
    }

}
