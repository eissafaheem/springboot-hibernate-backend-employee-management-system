package com.EMS.employee_management_system.models.classes;

public class DeleteEmployeeResult extends Result{
    public DeleteEmployeeResult() {
    }

    @Override
    public String toString() {
        return "DeleteEmployeeResult{" +
                "errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
