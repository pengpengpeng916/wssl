package com.fjaisino.application.common.model.fwsk.fpsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 09:52
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslInputFpxt {

    @XmlElement(name = "INPUT")
    private FpslInputInput input;

    public FpslInputInput getInput() {
        return input;
    }

    public void setInput(FpslInputInput input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "FpslInputFpxt{" +
                "input=" + input +
                '}';
    }
}
