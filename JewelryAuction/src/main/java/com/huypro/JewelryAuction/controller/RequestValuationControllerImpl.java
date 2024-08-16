package com.huypro.JewelryAuction.controller;

import com.huypro.JewelryAuction.dto.RequestValuationDTO;
import com.huypro.JewelryAuction.service.ServiceRequestValuationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestValuationControllerImpl implements RequestValuation{
    @Autowired
    private ServiceRequestValuationImpl serviceRequestValuation;
    @PostMapping("/makeRequest")
    public RequestValuationDTO make1RequestValuation(@RequestBody RequestValuationDTO requestValuationDTO) {

        return  serviceRequestValuation.makeRequestValuation(requestValuationDTO) ;
    }
    @GetMapping("/listRequested")
    @Override
    public List<RequestValuationDTO> ListRequestStateREQUESTED() {
        List<RequestValuationDTO> requestValuationDTOList = serviceRequestValuation.ListRequestStatusREQUESTED();
        return requestValuationDTOList;
    }

}
