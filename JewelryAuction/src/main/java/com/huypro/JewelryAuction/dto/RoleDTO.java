package com.huypro.JewelryAuction.dto;

import lombok.Data;

@Data
public class RoleDTO {
    private long id;
    private String roleName;

    public RoleDTO() {
    }

    public RoleDTO(long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }
}
