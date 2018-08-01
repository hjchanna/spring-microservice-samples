package com.hjchanna.sample.ws.product_subcategory.model;

import javax.persistence.*;

@Entity
@Table(name = "dim_product_subcategory")
public class DimProductSubcategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productSubcategoryKey;
    private Integer productCategory;
    private String productSubcategoryName;

    public DimProductSubcategory() {
    }

    public Integer getProductSubcategoryKey() {
        return productSubcategoryKey;
    }

    public void setProductSubcategoryKey(Integer productSubcategoryKey) {
        this.productSubcategoryKey = productSubcategoryKey;
    }

    public Integer getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Integer productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSubcategoryName() {
        return productSubcategoryName;
    }

    public void setProductSubcategoryName(String productSubcategoryName) {
        this.productSubcategoryName = productSubcategoryName;
    }
}
