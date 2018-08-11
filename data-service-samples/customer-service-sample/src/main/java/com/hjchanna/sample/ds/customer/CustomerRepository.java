package com.hjchanna.sample.ds.customer;

import com.hjchanna.sample.ds.customer.model.DimCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<DimCustomer, Integer> {

}
