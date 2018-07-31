package com.hjchanna.sample.ws.customer;

import com.hjchanna.sample.ws.customer.model.DimCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<DimCustomer, Integer> {

}
