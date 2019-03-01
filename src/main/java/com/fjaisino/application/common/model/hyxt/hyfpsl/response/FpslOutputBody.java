package com.fjaisino.application.common.model.hyxt.hyfpsl.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 20:31
 **/

@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslOutputBody {

    @XmlElement(name = "returnCode")
    private String returnCode;

    @XmlElement(name = "returnMessage")
    private String returnMessage;

    @XmlElement(name = "time")
    private String time;

    @XmlElement(name = "slxh")
    private String slxh;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSlxh() {
        return slxh;
    }

    public void setSlxh(String slxh) {
        this.slxh = slxh;
    }

    @Override
    public String toString() {
        return "FpslOutputBody{" +
                "returnCode='" + returnCode + '\'' +
                ", returnMessage='" + returnMessage + '\'' +
                ", time='" + time + '\'' +
                ", slxh='" + slxh + '\'' +
                '}';
    }
}
