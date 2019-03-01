package com.fjaisino.application.common.model.hyxt.hyztcx.response;

import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 21:25
 **/

@XmlRootElement(name = "sljg_mx")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxOutputSljgmxXh {

    @XmlAttribute()
    private String xh;

    @XmlElement(name = "fpdm")
    private String fpdm;

    @XmlElement(name = "qshm")
    private String qshm;

    @XmlElement(name = "zzhm")
    private String zzhm;

    @XmlElement(name = "fs")
    private String fs;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getFpdm() {
        return fpdm;
    }

    public void setFpdm(String fpdm) {
        this.fpdm = fpdm;
    }

    public String getQshm() {
        return qshm;
    }

    public void setQshm(String qshm) {
        this.qshm = qshm;
    }

    public String getZzhm() {
        return zzhm;
    }

    public void setZzhm(String zzhm) {
        this.zzhm = zzhm;
    }

    public String getFs() {
        return fs;
    }

    public void setFs(String fs) {
        this.fs = fs;
    }

    @Override
    public String toString() {
        return "ZtcxOutputSljgmxXh{" +
                "xh='" + xh + '\'' +
                ", fpdm='" + fpdm + '\'' +
                ", qshm='" + qshm + '\'' +
                ", zzhm='" + zzhm + '\'' +
                ", fs='" + fs + '\'' +
                '}';
    }
}
