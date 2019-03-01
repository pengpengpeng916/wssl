package com.fjaisino.application.common.model.outmessage.outparam;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-14 14:52
 **/

public class ResultData {

    private String returnCode;

    private String returnMessage;

    private String returnData;

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

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "returnCode='" + returnCode + '\'' +
                ", returnMessage='" + returnMessage + '\'' +
                ", returnData='" + returnData + '\'' +
                '}';
    }
}
