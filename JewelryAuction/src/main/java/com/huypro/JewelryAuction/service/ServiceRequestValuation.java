package com.huypro.JewelryAuction.service;

import com.huypro.JewelryAuction.dto.RequestValuationDTO;

import java.util.List;

public interface ServiceRequestValuation {
    public RequestValuationDTO makeRequestValuation(RequestValuationDTO reqValuationDTO);
    public List<RequestValuationDTO> ListRequestStatusREQUESTED();
}
