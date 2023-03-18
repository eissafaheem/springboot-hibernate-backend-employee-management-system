package com.EMS.employee_management_system.controller;

import com.EMS.employee_management_system.models.classes.AddEmployeeResult;
import com.EMS.employee_management_system.models.classes.AllEmployeeResult;
import com.EMS.employee_management_system.models.classes.Employee;
import com.EMS.employee_management_system.models.classes.UpdateEmployeeResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @PutMapping("/employee")
    public AddEmployeeResult addEmployee(@RequestBody Employee newEmployee){
        AddEmployeeResult a = new AddEmployeeResult();
        a.setErrorCode(0);
        a.setErrorMessage("Good Response");
        a.setResponse(newEmployee);
        return a;
    }

    @PostMapping("/employee")
    public UpdateEmployeeResult updateEmployee(@RequestBody Employee updateEmployeeRequest){
        UpdateEmployeeResult updateEmployeeResult = new UpdateEmployeeResult();
        updateEmployeeResult.setErrorCode(0);
        updateEmployeeResult.setErrorMessage("Good");
        updateEmployeeResult.setResponse(updateEmployeeRequest);
        return updateEmployeeResult;
    }

    @GetMapping("/all/employee")
    public AllEmployeeResult getAllEmployees(){
        return new AllEmployeeResult();
    }




//    	<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-data-jpa</artifactId>
//		</dependency>
}
