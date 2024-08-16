package com.huypro.JewelryAuction.repository;

import com.huypro.JewelryAuction.entity.RequestValuationE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestR extends JpaRepository<RequestValuationE,Long> {
}
