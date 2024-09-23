package com.huypro.JewelryAuction.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Role")
@Data
public class RoleE {
    @Id
    private Long id;
    @Column
    private String roleName;
    @OneToMany(mappedBy = "roleE", fetch = FetchType.LAZY)
    List<AccountE> accountEList;

    public RoleE() {

    }

    public RoleE(long id ,String roleName) {
        this.id = id;
        this.roleName = roleName;
    }
}
