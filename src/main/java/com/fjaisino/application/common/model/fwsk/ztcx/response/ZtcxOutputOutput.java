package com.fjaisino.application.common.model.fwsk.ztcx.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 20:45
 **/

@XmlRootElement(name = "OUTPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxOutputOutput {

    @XmlElement(name = "CODE")
    private String code;

    @XmlElement(name = "MESS")
    private String mess;

    @XmlElement(name = "DATA")
    private ZtcxOutputData data;

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

    public ZtcxOutputData getData() {
        return data;
    }

    public void setData(ZtcxOutputData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ZtcxOutputOutput{" +
                "code='" + code + '\'' +
                ", mess='" + mess + '\'' +
                ", data=" + data +
                '}';
    }
}
