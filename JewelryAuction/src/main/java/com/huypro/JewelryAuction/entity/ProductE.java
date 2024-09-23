    package com.huypro.JewelryAuction.entity;
    
    import jakarta.persistence.*;
    import lombok.Data;
    
    import java.util.List;
    
    @Entity
    @Table
    @Data
    public class ProductE {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column
        private String name;
        @Column
        private Float price;
        @Column
        private String description;
        @Lob
        @Column(name = "image", columnDefinition = "LONGBLOB",length = 100000000)
        private byte[] image;
        @OneToOne
        @JoinColumn(name = "RequestValuationE_id")
        private RequestValuationE RequestValuationE;
        @ManyToOne
        @JoinColumn(name = "category_id",nullable = false)
        private CategoryE categoryE;
        @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<LotE> lots;
        public ProductE() {
        }

        public ProductE(long id, String name, Float price, String description, byte[] image, com.huypro.JewelryAuction.entity.RequestValuationE requestValuationE, CategoryE categoryE) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.description = description;
            this.image = image;
            RequestValuationE = requestValuationE;
            this.categoryE = categoryE;
        }
    }
