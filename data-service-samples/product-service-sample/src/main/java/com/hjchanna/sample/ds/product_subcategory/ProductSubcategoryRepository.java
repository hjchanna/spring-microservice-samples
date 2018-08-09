package com.hjchanna.sample.ds.product_subcategory;

import com.hjchanna.sample.ds.product_subcategory.model.DimProductSubcategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSubcategoryRepository extends JpaRepository<DimProductSubcategory, Integer> {
}
