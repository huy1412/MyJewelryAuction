package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.LotDTO;
import com.huypro.JewelryAuction.entity.LotE;

public class LotM {
    public static LotDTO mapToDTO(LotE lot){
        return new LotDTO(
                lot.getId(),
                lot.getCurrentPrice(),
                lot.getStartPrice(),
                lot.getCurrentWinnerId(),
                lot.getBuyNowPrice(),
                lot.getPricePerStep(),
                lot.getMaxStep(),
                ProductM.mapToDTO(lot.getProduct()),
                lot.getStatus()

        );
    }
    public static LotE mapToEntityh(LotDTO lot){
        return new LotE(
                lot.getId(),
                lot.getCurrentPrice(),
                lot.getStartPrice(),
                lot.getCurrentWinnerId(),
                lot.getBuyNowPrice(),
                lot.getPricePerStep(),
                lot.getMaxStep()
        );
    }
}
