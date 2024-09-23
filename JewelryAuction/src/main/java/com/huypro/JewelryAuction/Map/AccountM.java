package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.AccountDTO;
import com.huypro.JewelryAuction.entity.AccountE;

public class AccountM {

    public static AccountDTO mapToDTO(AccountE account){
        return new AccountDTO(
                account.getId(),
                account.getUsername(),
                account.getPassword(),
                account.getEmail(),
                account.getPhone(),
                account.getAddress(),
                account.getFullName(),
                RoleM.mapToDTO(account.getRoleE())
        );
    }
    public static AccountE mapToEntity(AccountDTO account){
        return new AccountE(
                account.getId(),
                account.getUsername(),
                account.getPassword(),
                account.getEmail(),
                account.getPhone(),
                account.getAddress(),
                account.getFullName(),
                RoleM.toMapE(account.getRole())
        );
    }
}
