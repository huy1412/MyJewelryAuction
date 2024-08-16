package com.huypro.JewelryAuction.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class CategoryE {
    @Id
    private long id;
    @Column
    private String name;

    @OneToMany(mappedBy = "categoryE", fetch = FetchType.LAZY)
    private List<ProductE> productEs;
    public CategoryE() {
    }

    public CategoryE(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
