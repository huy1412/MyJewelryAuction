package com.huypro.JewelryAuction.controller;

import com.huypro.JewelryAuction.dto.AccountDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountController {
    public AccountDTO createAccount (@RequestBody AccountDTO accountDTO );
}
