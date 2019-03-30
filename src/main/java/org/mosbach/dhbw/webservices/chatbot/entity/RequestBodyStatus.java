package org.mosbach.dhbw.webservices.chatbot.entity;

public class RequestBodyStatus {
    private int code;
    private String errorType;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }
}
