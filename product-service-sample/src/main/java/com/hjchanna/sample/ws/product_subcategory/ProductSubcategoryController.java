package com.hjchanna.sample.ws.product_subcategory;

import com.hjchanna.sample.ws.product_subcategory.model.DimProductSubcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product-subcategory")
public class ProductSubcategoryController {

    @Autowired
    private ProductSubcategoryService productSubcategoryService;

    @GetMapping("/{productSubcategoryKey}")
    public DimProductSubcategory getProductSubcategory(@PathVariable Integer productSubcategoryKey) {
        return productSubcategoryService.getProductSubcategory(productSubcategoryKey);
    }
}
