package com.EMS.employee_management_system.services;

import com.EMS.employee_management_system.models.classes.*;

import java.util.List;

public interface EmployeeService {
    public List<Employee>  getAllEmployee();
    public AddEmployeeResult addEmployee(Employee newEmployee);
    public Employee updateEmployee(Employee updateEmployeeRequest);
    public Employee deleteEmployee(String id);

}
