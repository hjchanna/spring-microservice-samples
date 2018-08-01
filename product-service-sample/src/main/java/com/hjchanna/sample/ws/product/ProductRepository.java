package com.hjchanna.sample.ws.product;

import com.hjchanna.sample.ws.product.model.DimProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<DimProduct, Integer> {
}
