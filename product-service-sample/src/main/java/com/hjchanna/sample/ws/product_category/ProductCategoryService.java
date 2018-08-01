package com.hjchanna.sample.ws.product_category;

import com.hjchanna.sample.ws.product.model.DimProduct;
import com.hjchanna.sample.ws.product_category.model.DimProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public DimProductCategory getProductCategory(Integer productCategoryKey) {
        return productCategoryRepository
                .findById(productCategoryKey)
                .get();
    }
}
