package com.fjaisino.application.common.model.fwsk.ztcx.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 15:56
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxOutputFpxt {

    @XmlElement(name = "OUTPUT")
    private ZtcxOutputOutput output;

    public ZtcxOutputOutput getOutput() {
        return output;
    }

    public void setOutput(ZtcxOutputOutput output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "ZtcxOutputFpxt{" +
                "output=" + output +
                '}';
    }
}
