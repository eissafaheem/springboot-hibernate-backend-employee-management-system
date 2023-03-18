package com.EMS.employee_management_system.models.classes;

import com.EMS.employee_management_system.models.interfaces.IEmployee;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee implements IEmployee {
    @Id
    String id;
    String name;
    String email;
    String phone;
    String gender;
    String salary;
    String designation;
    String department;
    String address ;

    public Employee() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", salary='" + salary + '\'' +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
