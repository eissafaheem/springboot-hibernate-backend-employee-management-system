package com.EMS.employee_management_system.models.classes;

import java.util.Arrays;
import java.util.List;

public class AllEmployeeResult extends Result{
    public AllEmployeeResult() {
    }
    List<Employee> response;

    public List<Employee> getResponse() {
        return response;
    }

    public void setResponse(List<Employee> response) {
        this.response = response;
    }
}
