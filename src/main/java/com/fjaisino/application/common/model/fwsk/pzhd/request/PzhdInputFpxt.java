package com.fjaisino.application.common.model.fwsk.pzhd.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 16:09
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdInputFpxt {

    @XmlElement(name = "INPUT")
    private PzhdInputInput input;

    public PzhdInputInput getInput() {
        return input;
    }

    public void setInput(PzhdInputInput input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "PzhdInputFpxt{" +
                "input=" + input +
                '}';
    }
}
