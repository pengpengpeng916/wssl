package com.fjaisino.application.common.model.hyxt.hyfpsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description: 配送信息
 * @author: Mr.Peng
 * @create: 2018-12-11 15:35
 **/

@XmlRootElement(name = "psxx")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslInputPsxx {

    @XmlElement(name = "sjrxm")
    private String sjrxm;

    @XmlElement(name = "sjdz")
    private String sjdz;

    @XmlElement(name = "sjryddh")
    private String sjryddh;

    @XmlElement(name = "sjrgddh")
    private String sjrgddh;

    @XmlElement(name = "sjyb")
    private String sjyb;

    @XmlElement(name = "bzxx")
    private String bzxx;


    public String getSjrxm() {
        return sjrxm;
    }

    public void setSjrxm(String sjrxm) {
        this.sjrxm = sjrxm;
    }

    public String getSjdz() {
        return sjdz;
    }

    public void setSjdz(String sjdz) {
        this.sjdz = sjdz;
    }

    public String getSjryddh() {
        return sjryddh;
    }

    public void setSjryddh(String sjryddh) {
        this.sjryddh = sjryddh;
    }

    public String getSjrgddh() {
        return sjrgddh;
    }

    public void setSjrgddh(String sjrgddh) {
        this.sjrgddh = sjrgddh;
    }

    public String getSjyb() {
        return sjyb;
    }

    public void setSjyb(String sjyb) {
        this.sjyb = sjyb;
    }

    public String getBzxx() {
        return bzxx;
    }

    public void setBzxx(String bzxx) {
        this.bzxx = bzxx;
    }

    @Override
    public String toString() {
        return "FpslInputPsxx{" +
                "sjrxm='" + sjrxm + '\'' +
                ", sjdz='" + sjdz + '\'' +
                ", sjryddh='" + sjryddh + '\'' +
                ", sjrgddh='" + sjrgddh + '\'' +
                ", sjyb='" + sjyb + '\'' +
                ", bzxx='" + bzxx + '\'' +
                '}';
    }
}




























