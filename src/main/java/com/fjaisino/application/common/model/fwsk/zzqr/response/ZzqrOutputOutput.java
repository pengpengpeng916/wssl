package com.fjaisino.application.common.model.fwsk.zzqr.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 22:29
 **/

@XmlRootElement(name = "OUTPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZzqrOutputOutput {

    @XmlElement(name = "CODE")
    private String code;

    @XmlElement(name = "MESS")
    private String mess;

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

    @Override
    public String toString() {
        return "ZzqrOutputOutput{" +
                "code='" + code + '\'' +
                ", mess='" + mess + '\'' +
                '}';
    }
}
