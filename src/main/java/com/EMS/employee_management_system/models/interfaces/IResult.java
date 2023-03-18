package com.EMS.employee_management_system.models.interfaces;

public interface IResult {
    public int getErrorCode();
    public void setErrorCode(int errorCode);
    public String getErrorMessage();
    public void setErrorMessage(String errorMessage);
}
