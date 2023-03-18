package com.EMS.employee_management_system.models.classes;

import com.EMS.employee_management_system.models.interfaces.IResult;

public class Result implements IResult {
    int errorCode;
    String errorMessage;
    public Result() {
    }
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
