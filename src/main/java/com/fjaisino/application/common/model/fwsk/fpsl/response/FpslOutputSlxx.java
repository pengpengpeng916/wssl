package com.fjaisino.application.common.model.fwsk.fpsl.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 20:04
 **/

@XmlRootElement(name = "SLXX")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslOutputSlxx {

    @XmlElement(name = "FPZL")
    private String fpzl;

    @XmlElement(name = "FPZLDM")
    private String fpzldm;

    @XmlElement(name = "SQZT")
    private String sqzt;

    @XmlElement(name = "ZTMS")
    private String ztms;

    @XmlElement(name = "SLXH")
    private String slxh;

    public String getFpzl() {
        return fpzl;
    }

    public void setFpzl(String fpzl) {
        this.fpzl = fpzl;
    }

    public String getFpzldm() {
        return fpzldm;
    }

    public void setFpzldm(String fpzldm) {
        this.fpzldm = fpzldm;
    }

    public String getSqzt() {
        return sqzt;
    }

    public void setSqzt(String sqzt) {
        this.sqzt = sqzt;
    }

    public String getZtms() {
        return ztms;
    }

    public void setZtms(String ztms) {
        this.ztms = ztms;
    }

    public String getSlxh() {
        return slxh;
    }

    public void setSlxh(String slxh) {
        this.slxh = slxh;
    }

    @Override
    public String toString() {
        return "FpslOutputSlxx{" +
                "fpzl='" + fpzl + '\'' +
                ", fpzldm='" + fpzldm + '\'' +
                ", sqzt='" + sqzt + '\'' +
                ", ztms='" + ztms + '\'' +
                ", slxh='" + slxh + '\'' +
                '}';
    }
}





















