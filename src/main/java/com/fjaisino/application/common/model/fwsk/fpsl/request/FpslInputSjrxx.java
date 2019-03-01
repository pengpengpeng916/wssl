package com.fjaisino.application.common.model.fwsk.fpsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 14:42
 **/

@XmlRootElement(name = "SJRXX")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslInputSjrxx {

    @XmlElement(name = "SJR")
    private String sjr;

    @XmlElement(name = "YZBM")
    private String yzbm;

    @XmlElement(name = "DZ")
    private String dz;

    @XmlElement(name = "GH")
    private String gh;

    @XmlElement(name = "YDDH")
    private String yddh;

    @XmlElement(name = "BZ")
    private String bz;


    public String getSjr() {
        return sjr;
    }

    public void setSjr(String sjr) {
        this.sjr = sjr;
    }

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getGh() {
        return gh;
    }

    public void setGh(String gh) {
        this.gh = gh;
    }

    public String getYddh() {
        return yddh;
    }

    public void setYddh(String yddh) {
        this.yddh = yddh;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public String toString() {
        return "FpslInputSjrxx{" +
                "sjr='" + sjr + '\'' +
                ", yzbm='" + yzbm + '\'' +
                ", dz='" + dz + '\'' +
                ", gh='" + gh + '\'' +
                ", yddh='" + yddh + '\'' +
                ", bz='" + bz + '\'' +
                '}';
    }
}









