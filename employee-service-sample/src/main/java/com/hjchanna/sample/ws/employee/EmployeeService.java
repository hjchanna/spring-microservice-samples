package com.hjchanna.sample.ws.employee;

import com.hjchanna.sample.ws.employee.model.DimEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public DimEmployee getEmployee(Integer employeeKey) {
        return employeeRepository
                .findById(employeeKey)
                .get();
    }

    @Transactional
    public Integer postEmployee(DimEmployee employee) {
        return employeeRepository
                .save(employee)
                .getEmployeeKey();
    }

    @Transactional
    public Integer deleteEmployee(Integer employeeKey) {
        employeeRepository.deleteById(employeeKey);
        return employeeKey;
    }
}
