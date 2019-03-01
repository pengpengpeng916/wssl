package com.fjaisino.application.common.model.fwsk.fpsl.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 20:06
 **/

@XmlRootElement(name = "DATA")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslOutputData {

    @XmlElement(name = "NSRSBH")
    private String nsrsbh;

    @XmlElement(name = "KPJH")
    private String kpjh;

    @XmlElement(name = "SBBH")
    private String sbbh;

    @XmlElement(name = "SLXX")
    private FpslOutputSlxx slxx;

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getKpjh() {
        return kpjh;
    }

    public void setKpjh(String kpjh) {
        this.kpjh = kpjh;
    }

    public String getSbbh() {
        return sbbh;
    }

    public void setSbbh(String sbbh) {
        this.sbbh = sbbh;
    }

    public FpslOutputSlxx getSlxx() {
        return slxx;
    }

    public void setSlxx(FpslOutputSlxx slxx) {
        this.slxx = slxx;
    }

    @Override
    public String toString() {
        return "FpslOutputData{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", kpjh='" + kpjh + '\'' +
                ", sbbh='" + sbbh + '\'' +
                ", slxx=" + slxx +
                '}';
    }
}
