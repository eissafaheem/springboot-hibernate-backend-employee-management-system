package com.EMS.employee_management_system.controller;

import com.EMS.employee_management_system.models.classes.*;
import com.EMS.employee_management_system.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PutMapping("/employee")
    public AddEmployeeResult addEmployee(@RequestBody Employee newEmployee) {
        return employeeService.addEmployee(newEmployee);
    }

    @PostMapping("/employee")
    public UpdateEmployeeResult updateEmployee(@RequestBody Employee updateEmployeeRequest) {
        return employeeService.updateEmployee(updateEmployeeRequest);
    }

    @GetMapping("/all/employee")
    public AllEmployeeResult getAllEmployees() {
        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/employee/{id}")
    public DeleteEmployeeResult deleteEmployee(@PathVariable String id) {
        return employeeService.deleteEmployee(id);
    }
}



