package com.huypro.JewelryAuction.dto;

import lombok.Data;

@Data
public class AccountDTO {
    private long id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String fullName;
    private RoleDTO role;

    public AccountDTO() {

    }

    public AccountDTO(long id, String username, String password, String email, String phone, String address, String fullName, RoleDTO role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.fullName = fullName;
        this.role = role;
    }
}
