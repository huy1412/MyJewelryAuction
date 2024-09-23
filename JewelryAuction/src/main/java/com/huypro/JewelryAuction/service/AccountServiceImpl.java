package com.huypro.JewelryAuction.service;

import com.huypro.JewelryAuction.Map.AccountM;
import com.huypro.JewelryAuction.dto.AccountDTO;
import com.huypro.JewelryAuction.entity.AccountE;
import com.huypro.JewelryAuction.repository.AccountR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountR accountR;
    public AccountDTO createAccount(AccountDTO accountDTO) {
        AccountE accountE = AccountM.mapToEntity(accountDTO);
        accountR.save(accountE);
        return AccountM.mapToDTO(accountE);

    }
}
