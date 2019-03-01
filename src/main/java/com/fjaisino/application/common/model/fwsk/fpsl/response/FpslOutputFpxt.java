package com.fjaisino.application.common.model.fwsk.fpsl.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 10:48
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslOutputFpxt {

    @XmlElement(name = "OUTPUT")
    private FpslOutputOutput output;

    public FpslOutputOutput getOutput() {
        return output;
    }

    public void setOutput(FpslOutputOutput output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "FpslOutputFpxt{" +
                "output=" + output +
                '}';
    }
}
