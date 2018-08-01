package com.hjchanna.sample.ws.product_subcategory;

import com.hjchanna.sample.ws.product_subcategory.model.DimProductSubcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProductSubcategoryService {

    @Autowired
    private ProductSubcategoryRepository productSubcategoryRepository;

    public DimProductSubcategory getProductSubcategory(Integer productSubcategoryKey) {
        return productSubcategoryRepository
                .findById(productSubcategoryKey)
                .get();
    }
}
