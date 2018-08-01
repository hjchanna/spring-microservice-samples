package com.hjchanna.sample.ws.product;

import com.hjchanna.sample.ws.product.model.DimProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{productKey}")
    public DimProduct getProduct(@PathVariable Integer productKey) {
        return productService.getProduct(productKey);
    }

    @PostMapping
    public Integer postProduct(@RequestBody DimProduct product) {
        return productService.postProduct(product);
    }

    @DeleteMapping("/{productKey}")
    public Integer deleteProduct(@PathVariable Integer productKey) {
        return productService.deleteProduct(productKey);
    }
}
