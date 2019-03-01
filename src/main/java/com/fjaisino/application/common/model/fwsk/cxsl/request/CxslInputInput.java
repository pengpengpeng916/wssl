package com.fjaisino.application.common.model.fwsk.cxsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 17:38
 **/
@XmlRootElement(name = "INPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class CxslInputInput {

    @XmlElement(name = "NSRSBH")
    private String nsrsbh;

    @XmlElement(name = "SLXH")
    private String slxh;

    @XmlElement(name = "FPZLDM")
    private String fpzldm;

    @XmlElement(name = "SLSL")
    private String slsl;

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getSlxh() {
        return slxh;
    }

    public void setSlxh(String slxh) {
        this.slxh = slxh;
    }

    public String getFpzldm() {
        return fpzldm;
    }

    public void setFpzldm(String fpzldm) {
        this.fpzldm = fpzldm;
    }

    public String getSlsl() {
        return slsl;
    }

    public void setSlsl(String slsl) {
        this.slsl = slsl;
    }

    @Override
    public String toString() {
        return "CxslInputInput{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", slxh='" + slxh + '\'' +
                ", fpzldm='" + fpzldm + '\'' +
                ", slsl='" + slsl + '\'' +
                '}';
    }
}








