package com.fjaisino.application.common.model.fwsk.pzhd.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 16:20
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdOutputFpxt {

    @XmlElement(name = "OUTPUT")
    private PzhdOutputOutput output;

    public PzhdOutputOutput getOutput() {
        return output;
    }

    public void setOutput(PzhdOutputOutput output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "PzhdOutputFpxt{" +
                "output=" + output +
                '}';
    }
}
