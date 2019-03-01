package com.fjaisino.application.common.model.fwsk.psdz.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2019-03-01 14:11
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class PsdzOutputFpxt {

    @XmlElement(name = "OUTPUT")
    private PsdzOutputOutput output;

    public PsdzOutputOutput getOutput() {
        return output;
    }

    public void setOutput(PsdzOutputOutput output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "PsdzOutputFpxt{" +
                "output=" + output +
                '}';
    }
}
