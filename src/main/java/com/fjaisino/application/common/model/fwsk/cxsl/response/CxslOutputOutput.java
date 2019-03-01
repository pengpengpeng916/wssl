package com.fjaisino.application.common.model.fwsk.cxsl.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 22:38
 **/

@XmlRootElement(name = "OUTPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class CxslOutputOutput {

    @XmlElement(name = "CODE")
    private String code;

    @XmlElement(name = "MESS")
    private String mess;

    @XmlElement(name = "ZTMS")
    private String ztms;

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

    public String getZtms() {
        return ztms;
    }

    public void setZtms(String ztms) {
        this.ztms = ztms;
    }

    @Override
    public String toString() {
        return "CxslOutputOutput{" +
                "code='" + code + '\'' +
                ", mess='" + mess + '\'' +
                ", ztms='" + ztms + '\'' +
                '}';
    }
}
