package com.huypro.JewelryAuction.controller;

import com.huypro.JewelryAuction.dto.RequestValuationDTO;
import com.huypro.JewelryAuction.service.ServiceRequestValuationImpl;
import com.huypro.JewelryAuction.statusEnum.RequestValuationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;
@RequestMapping("/myproject")
@RestController
@CrossOrigin
public class RequestValuationControllerImpl implements RequestValuation{
    @Autowired
    private ServiceRequestValuationImpl serviceRequestValuation;
@Override
@PostMapping("/makeRequest")
    public RequestValuationDTO make1RequestValuation(@RequestBody RequestValuationDTO requestValuationDTO){
        return serviceRequestValuation.makeRequestValuation(requestValuationDTO);
    }
    @GetMapping("/listRequested")
    @Override
    public List<RequestValuationDTO> ListRequestStateREQUESTED() {
        return serviceRequestValuation.ListRequestStatusREQUESTED();
    }
    @GetMapping("/detailed{id}")
    @Override
    public RequestValuationDTO detailedRequestValuation(@PathVariable("id") Long id ) {
        return serviceRequestValuation.detailedRequestValuation(id);
    }
    @PatchMapping("/changeStatusAccept")
    @Override
    public RequestValuationDTO updateStatusRequestValuation(RequestValuationDTO reqValuationDTO) {
        return serviceRequestValuation.updateStatusRequestValuation(reqValuationDTO);
    }

}







//    public RequestValuationDTO make1RequestValuation(
//            @RequestParam("estimatePriceMax") BigDecimal estimatePriceMax,
//            @RequestParam("description") String description,
//            @RequestParam(value = "image", required = false) MultipartFile image) {
//
//        RequestValuationDTO requestValuationDTO = new RequestValuationDTO();
//        requestValuationDTO.setEstimatePriceMax(estimatePriceMax);
//        requestValuationDTO.setDescription(description);
//        return serviceRequestValuation.makeRequestValuation(requestValuationDTO);
//    }