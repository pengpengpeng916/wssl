package com.fjaisino.application.common.model.fwsk.fpsl.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 20:03
 **/

@XmlRootElement(name = "OUTPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslOutputOutput {

    @XmlElement(name = "CODE")
    private String code;

    @XmlElement(name = "MESS")
    private String mess;

    @XmlElement(name = "DATA")
    private FpslOutputData data;

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

    public FpslOutputData getData() {
        return data;
    }

    public void setData(FpslOutputData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FpslOutputOutput{" +
                "code='" + code + '\'' +
                ", mess='" + mess + '\'' +
                ", data=" + data +
                '}';
    }
}
