package com.huypro.JewelryAuction.Map;

import com.huypro.JewelryAuction.dto.RoleDTO;
import com.huypro.JewelryAuction.entity.RoleE;


public class RoleM {

    public static RoleDTO mapToDTO(RoleE role) {
        return new RoleDTO(
                role.getId(),
                role.getRoleName()
        );
    }
    public static RoleE toMapE(RoleDTO role) {
        return new RoleE(
                role.getId(),
                role.getRoleName()
        );
    }
}
