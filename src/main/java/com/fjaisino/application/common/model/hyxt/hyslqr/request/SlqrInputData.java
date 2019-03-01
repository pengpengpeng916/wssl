package com.fjaisino.application.common.model.hyxt.hyslqr.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 14:52
 **/
@XmlRootElement(name = "INPUTDATA")
@XmlAccessorType(XmlAccessType.FIELD)
public class SlqrInputData {

    @XmlElement(name = "SKTYPE")
    private String sktype;

    @XmlElement(name = "OPTYPE")
    private String optype;

    @XmlElement(name = "DATA")
    private SlqrInputBody data;

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

    public SlqrInputBody getData() {
        return data;
    }

    public void setData(SlqrInputBody data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SlqrInputData{" +
                "sktype='" + sktype + '\'' +
                ", optype='" + optype + '\'' +
                ", data=" + data +
                '}';
    }
}
