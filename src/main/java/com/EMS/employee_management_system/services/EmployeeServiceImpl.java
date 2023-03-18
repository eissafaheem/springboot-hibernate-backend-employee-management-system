package com.EMS.employee_management_system.services;

import com.EMS.employee_management_system.dao.EmployeeDao;
import com.EMS.employee_management_system.models.classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;
    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> allEmployees = employeeDao.findAll();
        return allEmployees;
    }

    @Override
    public AddEmployeeResult addEmployee(Employee newEmployee) {
        Employee addedEmployee = employeeDao.save(newEmployee);
        AddEmployeeResult a = new AddEmployeeResult();
        a.setErrorCode(0);
        a.setErrorMessage("Good Response");
        a.setResponse(addedEmployee);
        return a;
    }

    @Override
    public Employee updateEmployee(Employee updateEmployeeRequest) {

        return employeeDao.save(updateEmployeeRequest);
    }

    @Override
    public Employee deleteEmployee(String id) {
        employeeDao.deleteById(id);
        return new Employee();
    }
}
