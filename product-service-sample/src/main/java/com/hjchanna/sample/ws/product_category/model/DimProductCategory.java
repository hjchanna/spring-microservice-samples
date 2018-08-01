package com.hjchanna.sample.ws.product_category.model;

import javax.persistence.*;

@Entity
@Table(name = "dim_product_category")
public class DimProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productCategoryKey;
    private String productCategoryName;

    public DimProductCategory() {
    }

    public Integer getProductCategoryKey() {
        return productCategoryKey;
    }

    public void setProductCategoryKey(Integer productCategoryKey) {
        this.productCategoryKey = productCategoryKey;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }
}
