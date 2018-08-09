package com.hjchanna.sample.ds.product;

import com.hjchanna.sample.ds.product.model.DimProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public DimProduct getProduct(Integer productKey) {
        return productRepository
                .findById(productKey)
                .get();
    }

    @Transactional
    public Integer postProduct(DimProduct product) {
        return productRepository
                .save(product)
                .getProductKey();
    }

    @Transactional
    public Integer deleteProduct(Integer productKey) {
        productRepository.deleteById(productKey);
        return productKey;
    }
}
