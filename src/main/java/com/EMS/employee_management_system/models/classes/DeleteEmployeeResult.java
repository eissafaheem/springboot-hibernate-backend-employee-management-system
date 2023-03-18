package com.EMS.employee_management_system.models.classes;

public class DeleteEmployeeResult extends Result{
    public DeleteEmployeeResult() {
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
        return "DeleteEmployeeResult{" +
                "response=" + response.toString() +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
