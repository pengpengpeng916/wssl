package com.fjaisino.application.common.model.error;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-15 10:56
 **/

public class ErrorMsg {

    private String code;

    private String mess;

    private String returnCode;

    private String returnMessage;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    @Override
    public String toString() {
        return "ErrorMsg{" +
                "code='" + code + '\'' +
                ", mess='" + mess + '\'' +
                ", returnCode='" + returnCode + '\'' +
                ", returnMessage='" + returnMessage + '\'' +
                '}';
    }
}
