package com.fjaisino.application.common.model.fwsk.ztcx.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 16:07
 **/
@XmlRootElement(name = "CXTJ")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxInputCxtj {

    @XmlElement(name = "FPZL")
    private String fpzl;

    @XmlElement(name = "QSRQ")
    private String qsrq;

    @XmlElement(name = "JZRQ")
    private String jzrq;

    @XmlElement(name = "CLZT")
    private String clzt;

    @XmlElement(name = "SLXH")
    private String slxh;

    public String getFpzl() {
        return fpzl;
    }

    public void setFpzl(String fpzl) {
        this.fpzl = fpzl;
    }

    public String getQsrq() {
        return qsrq;
    }

    public void setQsrq(String qsrq) {
        this.qsrq = qsrq;
    }

    public String getJzrq() {
        return jzrq;
    }

    public void setJzrq(String jzrq) {
        this.jzrq = jzrq;
    }

    public String getClzt() {
        return clzt;
    }

    public void setClzt(String clzt) {
        this.clzt = clzt;
    }

    public String getSlxh() {
        return slxh;
    }

    public void setSlxh(String slxh) {
        this.slxh = slxh;
    }

    @Override
    public String toString() {
        return "ZtcxInputCxtj{" +
                "fpzl='" + fpzl + '\'' +
                ", qsrq='" + qsrq + '\'' +
                ", jzrq='" + jzrq + '\'' +
                ", clzt='" + clzt + '\'' +
                ", slxh='" + slxh + '\'' +
                '}';
    }
}







































