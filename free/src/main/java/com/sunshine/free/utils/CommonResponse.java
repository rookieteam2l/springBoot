package com.sunshine.free.utils;

public class CommonResponse<T> {

    private ResponseTypeEnums status;
    private String errorCode;
    private String errorMsg;
    private T result;

    public CommonResponse() {
    }

    public CommonResponse(ResponseTypeEnums status) {
        this.status = status;
    }

    public CommonResponse(ResponseTypeEnums status, T result) {
        this.status = status;
        this.result = result;
    }

    public CommonResponse(ResponseTypeEnums status, String errorCode, String errorMsg) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public CommonResponse(ResponseTypeEnums status, String errorCode, String errorMsg, T result) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.result = result;
    }

    public ResponseTypeEnums getStatus() {
        return status;
    }

    public void setStatus(ResponseTypeEnums status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
