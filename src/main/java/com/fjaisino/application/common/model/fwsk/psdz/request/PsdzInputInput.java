package com.fjaisino.application.common.model.fwsk.psdz.request;

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
@XmlRootElement(name = "INPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class PsdzInputInput {

    @XmlElement(name = "NSRSBH")
    private String nsrsbh;

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    @Override
    public String toString() {
        return "PsdzInputInput{" +
                "nsrsbh='" + nsrsbh + '\'' +
                '}';
    }
}
