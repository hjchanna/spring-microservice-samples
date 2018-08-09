package com.hjchanna.sample.ds.product_category;

import com.hjchanna.sample.ds.product_category.model.DimProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<DimProductCategory, Integer> {
}
