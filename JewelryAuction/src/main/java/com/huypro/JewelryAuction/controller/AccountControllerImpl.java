package com.huypro.JewelryAuction.controller;
import com.huypro.JewelryAuction.dto.AccountDTO;
import com.huypro.JewelryAuction.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountControllerImpl implements AccountController {
    @Autowired
    private AccountServiceImpl accountService;
    @PostMapping("/createAccount")
    public AccountDTO createAccount  ( @RequestBody AccountDTO accountDTO )  {
       return accountService.createAccount( accountDTO );
    }
}
