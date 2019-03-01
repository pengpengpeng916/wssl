package com.fjaisino.application.common.model.hyxt.hyztcx.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 16:31
 **/
@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxInputBody {

    @XmlElement(name = "nsrsbh")
    private String nsrsbh;

    @XmlElement(name = "fplx_dm")
    private String fplx_dm;

    @XmlElement(name = "slqssj")
    private String slqssj;

    @XmlElement(name = "sljzsj")
    private String sljzsj;

    @XmlElement(name = "slxh")
    private String slxh;

    @XmlElement(name = "clzt")
    private String clzt;


    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getFplx_dm() {
        return fplx_dm;
    }

    public void setFplx_dm(String fplx_dm) {
        this.fplx_dm = fplx_dm;
    }

    public String getSlqssj() { return slqssj; }

    public void setSlqssj(String slqssj) {
        this.slqssj = slqssj;
    }

    public String getSljzsj() { return sljzsj; }

    public void setSljzsj(String sljzsj) {
        this.sljzsj = sljzsj;
    }

    public String getSlxh() {
        return slxh;
    }

    public void setSlxh(String slxh) {
        this.slxh = slxh;
    }

    public String getClzt() {
        return clzt;
    }

    public void setClzt(String clzt) {
        this.clzt = clzt;
    }

    @Override
    public String toString() {
        return "FpslInputBody{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", fplx_dm='" + fplx_dm + '\'' +
                ", slqssj='" + slqssj + '\'' +
                ", sljzsj='" + sljzsj + '\'' +
                ", slxh='" + slxh + '\'' +
                ", clzt='" + clzt + '\'' +
                '}';
    }
}
