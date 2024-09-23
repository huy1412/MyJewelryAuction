package com.huypro.JewelryAuction.controller;

import com.huypro.JewelryAuction.dto.RequestValuationDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RequestValuation {
    public RequestValuationDTO make1RequestValuation(RequestValuationDTO reqValuation);
    public List<RequestValuationDTO> ListRequestStateREQUESTED();
    public RequestValuationDTO  detailedRequestValuation(Long id);
    public RequestValuationDTO updateStatusRequestValuation(RequestValuationDTO reqValuationDTO);


}
