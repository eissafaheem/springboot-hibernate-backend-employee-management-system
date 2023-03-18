package com.EMS.employee_management_system.models.classes;

public class UpdateEmployeeResult extends Result{

    public UpdateEmployeeResult() {
    }
    Employee response;
    public Employee getResponse() {
        return response;
    }

    public void setResponse(Employee response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "UpdateEmployeeResult{" +
                "response=" + response.toString() +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
