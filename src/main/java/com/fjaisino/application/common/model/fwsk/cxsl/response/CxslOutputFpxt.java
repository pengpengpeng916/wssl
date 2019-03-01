package com.fjaisino.application.common.model.fwsk.cxsl.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 16:43
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class CxslOutputFpxt {

    @XmlElement(name = "OUTPUT")
    private CxslOutputOutput output;

    public CxslOutputOutput getOutput() {
        return output;
    }

    public void setOutput(CxslOutputOutput output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "CxslOutputFpxt{" +
                "output=" + output +
                '}';
    }
}
