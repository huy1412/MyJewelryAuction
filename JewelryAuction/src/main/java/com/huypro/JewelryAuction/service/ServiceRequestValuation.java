package com.huypro.JewelryAuction.service;

import com.huypro.JewelryAuction.dto.RequestValuationDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ServiceRequestValuation {
    public RequestValuationDTO makeRequestValuation(RequestValuationDTO reqValuationDTO);
    public List<RequestValuationDTO> ListRequestStatusREQUESTED();
    public RequestValuationDTO detailedRequestValuation(Long id);
    public  RequestValuationDTO updateStatusRequestValuation(RequestValuationDTO reqValuationDTO);
}
