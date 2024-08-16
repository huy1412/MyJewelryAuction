package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.AuctionSessionDTO;
import com.huypro.JewelryAuction.entity.AuctionSessionE;

import java.util.Base64;

public class AuctionSessionM {

    public static AuctionSessionDTO mapToDTO(AuctionSessionE auctionSession){
        String encodedImage = auctionSession.getImage() != null ? Base64.getEncoder().encodeToString(auctionSession.getImage()) : null;

        return new AuctionSessionDTO(
                auctionSession.getId(),
                auctionSession.getStartingBid(),
                auctionSession.getStartTime(),
                auctionSession.getEndTime(),
                auctionSession.getName(),
                auctionSession.getDescription(),
                encodedImage,
                auctionSession.getStatus()
        );
    }
    public static AuctionSessionE mapToDTO(AuctionSessionDTO auctionSession){
        byte[] decodedImage = auctionSession.getImage() != null ? Base64.getDecoder().decode(auctionSession.getImage()) : null;

        return new AuctionSessionE(
                auctionSession.getId(),
                auctionSession.getStartingBid(),
                auctionSession.getStartTime(),
                auctionSession.getEndTime(),
                auctionSession.getName(),
                auctionSession.getDescription(),
                decodedImage
        );
    }

}
