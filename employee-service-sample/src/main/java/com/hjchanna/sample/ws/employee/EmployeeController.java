package com.hjchanna.sample.ws.employee;

import com.hjchanna.sample.ws.employee.model.DimEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{employeeKey}")
    public DimEmployee getEmployee(@PathVariable Integer employeeKey) {
        return employeeService.getEmployee(employeeKey);
    }

    @PostMapping
    public Integer postEmployee(@RequestBody DimEmployee employee) {
        return employeeService.postEmployee(employee);
    }

    @DeleteMapping
    public Integer deleteEmployee(@PathVariable Integer employeeKey) {
        return employeeService.deleteEmployee(employeeKey);
    }
}
