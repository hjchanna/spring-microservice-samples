package com.hjchanna.sample.ds.employee;

import com.hjchanna.sample.ds.employee.model.DimEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<DimEmployee, Integer> {
}
