package com.hjchanna.sample.ds.product;

import com.hjchanna.sample.ds.product.model.DimProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<DimProduct, Integer> {
}
