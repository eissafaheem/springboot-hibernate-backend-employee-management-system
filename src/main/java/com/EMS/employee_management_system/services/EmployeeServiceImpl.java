package com.EMS.employee_management_system.services;

import com.EMS.employee_management_system.dao.EmployeeDao;
import com.EMS.employee_management_system.models.classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Employee addEmployee(Employee newEmployee) {
        Employee addedEmployee = employeeDao.save(newEmployee);
        return addedEmployee;
    }

    @Override
    public Employee updateEmployee(Employee updateEmployeeRequest) {

        Employee updatedEmployee = employeeDao.save(updateEmployeeRequest);
        return updatedEmployee;
    }

    @Override
    public Employee deleteEmployee(String id) {
        employeeDao.deleteById(id);
        return new Employee();
    }

    @Override
    public boolean checkIfEmployeeExists(String id) {
        Optional<Employee> optionalEmployee = employeeDao.findById(id);
        return optionalEmployee.isPresent();
    }
}
