package com.EMS.employee_management_system.models.classes;

public class AddEmployeeResult extends Result{
    Employee response;

    public AddEmployeeResult() {
    }

    public Employee getResponse() {
        return response;
    }

    public void setResponse(Employee response) {
        this.response = response;
    }

    public AddEmployeeResult(Employee response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "AddEmployeeResult{" +
                "response=" + response.toString() +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
