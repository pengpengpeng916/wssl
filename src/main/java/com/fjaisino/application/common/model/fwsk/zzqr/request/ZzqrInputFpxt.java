package com.fjaisino.application.common.model.fwsk.zzqr.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 16:32
 **/

@XmlRootElement(name = "FPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZzqrInputFpxt {

    @XmlElement(name = "INPUT")
    private ZzqrInputInput input;

    public ZzqrInputInput getInput() {
        return input;
    }

    public void setInput(ZzqrInputInput input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "ZzqrInputFpxt{" +
                "input=" + input +
                '}';
    }
}
