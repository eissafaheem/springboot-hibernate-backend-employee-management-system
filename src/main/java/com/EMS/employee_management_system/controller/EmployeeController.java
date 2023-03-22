package com.EMS.employee_management_system.controller;

import com.EMS.employee_management_system.models.classes.*;
import com.EMS.employee_management_system.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PutMapping("/employee")
    public AddEmployeeResult addEmployee(@RequestBody Employee newEmployee) {

        AddEmployeeResult addEmployeeResult = new AddEmployeeResult();
        Employee addedEmployee = new Employee();

        try{
            boolean isEmployeeExists = employeeService.checkIfEmployeeExists(newEmployee.getId());
            if(!isEmployeeExists){
                addedEmployee = employeeService.addEmployee(newEmployee);
                if(addEmployeeResult==null){
                    addEmployeeResult.setErrorCode(500);
                    addEmployeeResult.setErrorMessage("Internal Server Error");
                    addEmployeeResult.setResponse(addedEmployee);
                    return addEmployeeResult;
                }
            }
            else{
                addEmployeeResult.setErrorCode(409);
                addEmployeeResult.setErrorMessage("Employee already exists");
                addEmployeeResult.setResponse(addedEmployee);
                return addEmployeeResult;
            }
        }
        catch(Error e){
            addEmployeeResult.setErrorCode(503);
            addEmployeeResult.setErrorMessage("Service Unavailable");
            addEmployeeResult.setResponse(addedEmployee);
            return addEmployeeResult;
        }

        addEmployeeResult.setErrorCode(0);
        addEmployeeResult.setErrorMessage("Success");
        addEmployeeResult.setResponse(addedEmployee);
        return addEmployeeResult;
    }

    @GetMapping(value = "/all/employee")
    public ResponseEntity<AllEmployeeResult> getAllEmployees() {

        AllEmployeeResult allEmployeeResult = new AllEmployeeResult();
        List<Employee> employees = new ArrayList<>();

        try{
            employees = employeeService.getAllEmployee();
            if(employees==null){
                allEmployeeResult.setErrorCode(500);
                allEmployeeResult.setErrorMessage("Internal Server Error");
                allEmployeeResult.setResponse(employees);
                return ResponseEntity.ok(allEmployeeResult);
            }
            else if(employees.size()==0){
                allEmployeeResult.setErrorCode(404);
                allEmployeeResult.setErrorMessage("No employees present");
                allEmployeeResult.setResponse(employees);
                return ResponseEntity.ok(allEmployeeResult);
            }
        }
        catch(Error e){
            allEmployeeResult.setErrorCode(503);
            allEmployeeResult.setErrorMessage("Service Unavailable");
            allEmployeeResult.setResponse(employees);
            return ResponseEntity.ok(allEmployeeResult);
        }

        allEmployeeResult.setErrorMessage("Success");
        allEmployeeResult.setErrorCode(0);
        allEmployeeResult.setResponse(employees);
        return ResponseEntity.ok(allEmployeeResult);
    }

    @PostMapping("/employee")
    public ResponseEntity<UpdateEmployeeResult> updateEmployee(@RequestBody Employee updateEmployeeRequest) {

        UpdateEmployeeResult updateEmployeeResult = new UpdateEmployeeResult();
        Employee updatedEmployee = new Employee();

        try{
            boolean isEmployeeExists = employeeService.checkIfEmployeeExists(updateEmployeeRequest.getId());
            if(isEmployeeExists){
                updatedEmployee= employeeService.updateEmployee(updateEmployeeRequest);
                if(updatedEmployee==null){
                    updateEmployeeResult.setErrorCode(500);
                    updateEmployeeResult.setErrorMessage("Internal Server Error");
                    updateEmployeeResult.setResponse(updatedEmployee);
                    return ResponseEntity.ok(updateEmployeeResult);
                }
            }
            else{
                updateEmployeeResult.setErrorCode(404);
                updateEmployeeResult.setErrorMessage("Employee does not exists");
                updateEmployeeResult.setResponse(updatedEmployee);
                return ResponseEntity.ok(updateEmployeeResult);
            }
        }
        catch(Error e){
            updateEmployeeResult.setErrorCode(503);
            updateEmployeeResult.setErrorMessage("Service Unavailable");
            updateEmployeeResult.setResponse(updatedEmployee);
            return ResponseEntity.ok(updateEmployeeResult);
        }

        updateEmployeeResult.setErrorCode(0);
        updateEmployeeResult.setErrorMessage("Success");
        updateEmployeeResult.setResponse(updatedEmployee);
        return ResponseEntity.ok(updateEmployeeResult);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<DeleteEmployeeResult> deleteEmployee(@PathVariable String id) {
        Employee deletedEmployee = new Employee();
        DeleteEmployeeResult deleteEmployeeResult = new DeleteEmployeeResult();

        try{
            employeeService.deleteEmployee(id);
        }
        catch(Error e){
            deleteEmployeeResult.setErrorCode(503);
            deleteEmployeeResult.setErrorMessage("Service Unavailable");
            return ResponseEntity.ok(deleteEmployeeResult);
        }

        deleteEmployeeResult.setErrorCode(0);
        deleteEmployeeResult.setErrorMessage("Success");
        return ResponseEntity.ok(deleteEmployeeResult);
    }
}



