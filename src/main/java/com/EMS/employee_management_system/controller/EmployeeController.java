package com.EMS.employee_management_system.controller;

import com.EMS.employee_management_system.models.classes.*;
import com.EMS.employee_management_system.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PutMapping("/employee")
    public AddEmployeeResult addEmployee(@RequestBody Employee newEmployee) {
        return employeeService.addEmployee(newEmployee);
    }

    @GetMapping(value = "/all/employee", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AllEmployeeResult> getAllEmployees() {
        AllEmployeeResult a = new AllEmployeeResult();
        List<Employee> employees = employeeService.getAllEmployee();
        a.setErrorMessage("Successfull");
        a.setErrorCode(0);
        a.setResponse(employees);
        return ResponseEntity.ok(a);
    }

    @PostMapping("/employee")
    public ResponseEntity<UpdateEmployeeResult> updateEmployee(@RequestBody Employee updateEmployeeRequest) {

        Employee updatedEmployee = employeeService.updateEmployee(updateEmployeeRequest);

        UpdateEmployeeResult updateEmployeeResult = new UpdateEmployeeResult();
        updateEmployeeResult.setErrorCode(0);
        updateEmployeeResult.setErrorMessage("Light");
        updateEmployeeResult.setResponse(updatedEmployee);
        return ResponseEntity.ok(updateEmployeeResult);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<DeleteEmployeeResult> deleteEmployee(@PathVariable String id) {
        Employee deletedEmployee = employeeService.deleteEmployee(id);
        DeleteEmployeeResult deleteEmployeeResult = new DeleteEmployeeResult();
        deleteEmployeeResult.setErrorCode(0);
        deleteEmployeeResult.setErrorMessage("Good");
        deleteEmployeeResult.setResponse(new Employee());
        return ResponseEntity.ok(deleteEmployeeResult);
    }
}



