package com.hjchanna.sample.ws.customer;

import com.hjchanna.sample.ws.customer.model.DimCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @GetMapping("/{customerKey}")
    public DimCustomer getCustomer(@PathVariable Integer customerKey) {
        return customerService.getCustomer(customerKey);
    }

    @PostMapping
    public Integer postCustomer(@RequestBody DimCustomer customer) {
        return customerService.postCustomer(customer);
    }

    @DeleteMapping("/{customerKey}")
    public Integer deleteCustomer(@PathVariable Integer customerKey) {
        return customerService.deleteCustomer(customerKey);
    }
}
