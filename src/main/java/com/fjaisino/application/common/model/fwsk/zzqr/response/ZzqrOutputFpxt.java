package com.fjaisino.application.common.model.fwsk.zzqr.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 16:36
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZzqrOutputFpxt {

    @XmlElement(name = "OUTPUT")
    private ZzqrOutputOutput output;

    public ZzqrOutputOutput getOutput() {
        return output;
    }

    public void setOutput(ZzqrOutputOutput output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "ZzqrOutputFpxt{" +
                "output=" + output +
                '}';
    }
}
