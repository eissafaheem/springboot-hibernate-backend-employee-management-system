package com.EMS.employee_management_system.services;

import com.EMS.employee_management_system.models.classes.*;

public interface EmployeeService {
    public AllEmployeeResult getAllEmployee();
    public AddEmployeeResult addEmployee(Employee newEmployee);
    public UpdateEmployeeResult updateEmployee(Employee updateEmployeeRequest);
    public DeleteEmployeeResult deleteEmployee(String id);

}
