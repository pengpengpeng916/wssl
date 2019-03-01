package com.fjaisino.application.common.model.fwsk.psdz.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2019-03-01 14:09
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class PsdzInputFpxt {

    @XmlElement(name = "INPUT")
    private PsdzInputInput input;

    public PsdzInputInput getInput() {
        return input;
    }

    public void setInput(PsdzInputInput input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "PsdzInputFpxt{" +
                "input=" + input +
                '}';
    }
}
