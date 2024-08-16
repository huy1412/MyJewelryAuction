package com.huypro.JewelryAuction.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Account")
@Data
public class AccountE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String fullName;
    @Column
    private String phone;
    @Column
    private String address;
    @ManyToOne
    @JoinColumn(name = "Role_id", nullable = false)
    private RoleE roleE;

    public AccountE() {

    }

    public AccountE(long id, String username, String password, String email, String fullName, String phone, String address, RoleE roleE) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.roleE = roleE;
    }
}
