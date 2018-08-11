package com.hjchanna.sample.ds.customer;

import com.hjchanna.sample.ds.customer.model.DimCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public DimCustomer getCustomer(Integer customerKey) {
        return customerRepository
                .findById(customerKey)
                .get();
    }

    @Transactional
    public Integer postCustomer(DimCustomer customer) {
        return customerRepository
                .save(customer)
                .getCustomerKey();
    }

    @Transactional
    public Integer deleteCustomer(Integer customerKey) {
        customerRepository.deleteById(customerKey);
        return customerKey;
    }
}
