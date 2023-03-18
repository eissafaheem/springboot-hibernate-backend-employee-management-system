package com.EMS.employee_management_system.services;

import com.EMS.employee_management_system.models.classes.*;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public AllEmployeeResult getAllEmployee() {
        AllEmployeeResult allEmployeeResult = new AllEmployeeResult();
        allEmployeeResult.setErrorCode(0);
        allEmployeeResult.setErrorMessage("Good");
        allEmployeeResult.setResponse(new Employee[]{});

        return allEmployeeResult;
    }

    @Override
    public AddEmployeeResult addEmployee(Employee newEmployee) {
        AddEmployeeResult a = new AddEmployeeResult();
        a.setErrorCode(0);
        a.setErrorMessage("Good Response");
        a.setResponse(newEmployee);
        return a;
    }

    @Override
    public UpdateEmployeeResult updateEmployee(Employee updateEmployeeRequest) {
        UpdateEmployeeResult updateEmployeeResult = new UpdateEmployeeResult();
        updateEmployeeResult.setErrorCode(0);
        updateEmployeeResult.setErrorMessage("Good");
        updateEmployeeResult.setResponse(updateEmployeeRequest);
        return updateEmployeeResult;
    }

    @Override
    public DeleteEmployeeResult deleteEmployee(String id) {
        DeleteEmployeeResult deleteEmployeeResult = new DeleteEmployeeResult();
        deleteEmployeeResult.setErrorCode(0);
        deleteEmployeeResult.setErrorMessage("Good");
        deleteEmployeeResult.setResponse(new Employee());

        return deleteEmployeeResult;
    }
}
