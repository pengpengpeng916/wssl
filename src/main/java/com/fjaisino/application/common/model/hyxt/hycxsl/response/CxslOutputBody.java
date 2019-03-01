package com.fjaisino.application.common.model.hyxt.hycxsl.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 22:45
 **/
@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CxslOutputBody {

    @XmlElement(name = "returnCode")
    private String returnCode;

    @XmlElement(name = "returnMessage")
    private String returnMessage;

    @XmlElement(name = "cljg")
    private String cljg;

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

    public String getCljg() {
        return cljg;
    }

    public void setCljg(String cljg) {
        this.cljg = cljg;
    }

    @Override
    public String toString() {
        return "CxslInputBody{" +
                "returnCode='" + returnCode + '\'' +
                ", returnMessage='" + returnMessage + '\'' +
                ", cljg='" + cljg + '\'' +
                '}';
    }
}
