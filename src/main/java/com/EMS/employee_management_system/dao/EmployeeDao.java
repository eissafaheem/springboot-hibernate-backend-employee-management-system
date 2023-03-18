package com.EMS.employee_management_system.dao;

import com.EMS.employee_management_system.models.classes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,String> {

}
