package com.huypro.JewelryAuction.service;

import com.huypro.JewelryAuction.Map.RequestValuationM;
import com.huypro.JewelryAuction.dto.RequestValuationDTO;
import com.huypro.JewelryAuction.entity.RequestValuationE;
import com.huypro.JewelryAuction.repository.RequestR;
import com.huypro.JewelryAuction.statusEnum.RequestValuationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



@Service
public class ServiceRequestValuationImpl implements ServiceRequestValuation {
    @Autowired
    private RequestR requestR;
    @Override
    public RequestValuationDTO makeRequestValuation(RequestValuationDTO requestValuationDTO) {
        requestValuationDTO.setTimeRequest(LocalDateTime.now());
        requestValuationDTO.setStatus(RequestValuationStatus.REQUESTED);
        RequestValuationE requestValuation = RequestValuationM.mapToEntity(requestValuationDTO);
        requestR.save(requestValuation);
        return RequestValuationM.mapToDTO(requestValuation);
    }


    @Override
    public List<RequestValuationDTO> ListRequestStatusREQUESTED() {
        List<RequestValuationE> listStateREQUESTED = requestR.findAll();
        List<RequestValuationDTO> listStateREQUESTEDDTO = new ArrayList<>();
        RequestValuationStatus status = RequestValuationStatus.REQUESTED;

        for (RequestValuationE requestValuation : listStateREQUESTED) {
            if (requestValuation.getStatus() == status) {
                listStateREQUESTEDDTO.add(RequestValuationM.mapToDTO(requestValuation));
            }
        }

        return listStateREQUESTEDDTO;
    }

    @Override
    public RequestValuationDTO detailedRequestValuation( Long id ) {
        RequestValuationE requestValuationE =requestR.getReferenceById(id);
        return RequestValuationM.mapToDTO(requestValuationE);
    }

    @Override
    public RequestValuationDTO updateStatusRequestValuation(RequestValuationDTO reqValuationDTO) {
       reqValuationDTO.setStatus(RequestValuationStatus.ACCEPT);
       RequestValuationE requestValuation = RequestValuationM.mapToEntity(reqValuationDTO);
       requestR.save(requestValuation);
        return RequestValuationM.mapToDTO(requestValuation);
    }

}
