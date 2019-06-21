package com.sunshine.free.utils;

import org.thymeleaf.util.StringUtils;

/**
 *  返回错误信息
 *
 * @author  free
 * @date 2019-06-21
 */

public enum MessageEnums {

    SUCCESS_S_2000("S","S2000","请求处理成功");


    private String code;
    private String errorType;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    MessageEnums(String aerrorType, String acode, String amessage) {
        this.errorType = errorType;
        this.code = code;
        this.message = message;
    }

    public static MessageEnums getByCode(String code){
        if(StringUtils.isEmpty(code)){
            return null;
        }

        for(MessageEnums con : MessageEnums.values()){
            if (con.getCode().equals(code)){
                return con;
            }
        }
        return null;
    }

    public static MessageEnums getByErrorType(String errorType){
        if(StringUtils.isEmpty(errorType)){
            return null;
        }

        for (MessageEnums con : MessageEnums.values()){
            if (con.getErrorType().equals(errorType)){
                return con;
            }
        }
        return null;
    }
}
