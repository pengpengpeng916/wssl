package com.fjaisino.application.common.model.outmessage.outzzsfpxt.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-14 11:01
 **/
@XmlRootElement(name = "ZZSFPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class OuterOutputZzsfpxt {

    @XmlElement(name = "SK_TYPE")
    private String sktype;

    @XmlElement(name = "OP_TYPE")
    private String optype;

    @XmlElement(name = "responseCode")
    private String responseCode;

    @XmlElement(name = "responseMessage")
    private String responseMessage;

    @XmlElement(name = "INPUT")
    private OuterOutputInput input;

    public String getSktype() {
        return sktype;
    }

    public void setSktype(String sktype) {
        this.sktype = sktype;
    }

    public String getOptype() {
        return optype;
    }

    public void setOptype(String optype) {
        this.optype = optype;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public OuterOutputInput getInput() {
        return input;
    }

    public void setInput(OuterOutputInput input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "OuterOutputZzsfpxt{" +
                "sktype='" + sktype + '\'' +
                ", optype='" + optype + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                ", input=" + input +
                '}';
    }
}
