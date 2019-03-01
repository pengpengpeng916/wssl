package com.fjaisino.application.common.model.fwsk.pzhd.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 22:00
 **/

@XmlRootElement(name = "OUTPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdOutputOutput {

    @XmlElement(name = "CODE")
    private String code;

    @XmlElement(name = "MESS")
    private String mess;

    @XmlElement(name = "DATA")
    private PzhdOutputData data;

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

    public PzhdOutputData getData() {
        return data;
    }

    public void setData(PzhdOutputData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PzhdOutputOutput{" +
                "code='" + code + '\'' +
                ", mess='" + mess + '\'' +
                ", data=" + data +
                '}';
    }
}
