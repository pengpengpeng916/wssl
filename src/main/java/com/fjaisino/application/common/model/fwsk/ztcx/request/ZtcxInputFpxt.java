package com.fjaisino.application.common.model.fwsk.ztcx.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 15:39
 **/
@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxInputFpxt {

    @XmlElement(name = "INPUT")
    private ZtcxInputInput input;

    public ZtcxInputInput getInput() {
        return input;
    }

    public void setInput(ZtcxInputInput input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "ZtcxInputFpxt{" +
                "input=" + input +
                '}';
    }
}
