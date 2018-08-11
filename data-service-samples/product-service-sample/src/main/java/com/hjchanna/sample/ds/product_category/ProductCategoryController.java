package com.hjchanna.sample.ds.product_category;

import com.hjchanna.sample.ds.product_category.model.DimProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product-category")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/{productCategoryKey}")
    public DimProductCategory getProductCategory(@PathVariable Integer productCategoryKey) {
        return productCategoryService.getProductCategory(productCategoryKey);
    }
}
