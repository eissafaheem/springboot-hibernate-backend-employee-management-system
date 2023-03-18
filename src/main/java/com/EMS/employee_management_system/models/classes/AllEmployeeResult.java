package com.EMS.employee_management_system.models.classes;

import java.util.Arrays;

public class AllEmployeeResult extends Result{
    public AllEmployeeResult() {
    }
    Employee[] response;

    public Employee[] getResponse() {
        return response;
    }

    public void setResponse(Employee[] response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "AllEmployeeResult{" +
                "response=" + Arrays.toString(response) +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
