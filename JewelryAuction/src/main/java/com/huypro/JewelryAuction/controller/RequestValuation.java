package com.huypro.JewelryAuction.controller;

import com.huypro.JewelryAuction.dto.RequestValuationDTO;

import java.util.List;

public interface RequestValuation {
    public RequestValuationDTO make1RequestValuation(RequestValuationDTO reqValuation);
    public List<RequestValuationDTO> ListRequestStateREQUESTED();
}
