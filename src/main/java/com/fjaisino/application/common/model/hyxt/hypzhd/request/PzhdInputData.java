package com.fjaisino.application.common.model.hyxt.hypzhd.request;

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
public class PzhdInputData {

    @XmlElement(name = "SKTYPE")
    private String sktype;

    @XmlElement(name = "OPTYPE")
    private String optype;

    @XmlElement(name = "DATA")
    private PzhdInputBody data;

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

    public PzhdInputBody getData() {
        return data;
    }

    public void setData(PzhdInputBody data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FwskPzhdInputData{" +
                "sktype='" + sktype + '\'' +
                ", optype='" + optype + '\'' +
                ", data=" + data +
                '}';
    }
}
