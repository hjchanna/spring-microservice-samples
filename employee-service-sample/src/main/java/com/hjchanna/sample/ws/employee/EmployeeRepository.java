package com.hjchanna.sample.ws.employee;

import com.hjchanna.sample.ws.employee.model.DimEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<DimEmployee, Integer> {
}
