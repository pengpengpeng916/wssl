package com.fjaisino.application.common.model.fwsk.cxsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 16:41
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class CxslInputFpxt {

    @XmlElement(name = "INPUT")
    private CxslInputInput input;

    public CxslInputInput getInput() {
        return input;
    }

    public void setInput(CxslInputInput input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "CxslInputFpxt{" +
                "input=" + input +
                '}';
    }
}
