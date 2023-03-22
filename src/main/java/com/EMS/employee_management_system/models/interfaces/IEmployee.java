package com.EMS.employee_management_system.models.interfaces;

public interface IEmployee {
    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getEmail();
    public void setEmail(String email);
    public String getPhone();
    public void setPhone(String phone);
    public String getGender();
    public void setGender(String gender);
    public String getSalary();
    public void setSalary(String salary);
    public String getDesignation();
    public void setDesignation(String designation);
    public String getDepartment();
    public void setDepartment(String department);
    public String getAddress();
    public void setAddress(String address);
    public String toString();
}
