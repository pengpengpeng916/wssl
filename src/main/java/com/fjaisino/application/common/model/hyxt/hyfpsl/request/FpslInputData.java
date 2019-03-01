package com.fjaisino.application.common.model.hyxt.hyfpsl.request;

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
public class FpslInputData {

    @XmlElement(name = "SKTYPE")
    private String sktype;

    @XmlElement(name = "OPTYPE")
    private String optype;

    @XmlElement(name = "DATA")
    private FpslInputBody data;

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

    public FpslInputBody getData() {
        return data;
    }

    public void setData(FpslInputBody data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FwskFpslInputData{" +
                "sktype='" + sktype + '\'' +
                ", optype='" + optype + '\'' +
                ", data=" + data +
                '}';
    }
}
