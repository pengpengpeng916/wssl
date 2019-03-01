package com.fjaisino.application.common.model.fwsk.ztcx.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 20:44
 **/
@XmlRootElement(name = "FPJXX")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxOutputFpjxx {

    @XmlElement(name = "FPDM")
    private String fpdm;

    @XmlElement(name = "QSHM")
    private String qshm;

    @XmlElement(name = "ZZHM")
    private String zzhm;

    @XmlElement(name = "FS")
    private String fs;

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
        return "ZtcxOutputFpjxx{" +
                "fpdm='" + fpdm + '\'' +
                ", qshm='" + qshm + '\'' +
                ", zzhm='" + zzhm + '\'' +
                ", fs='" + fs + '\'' +
                '}';
    }
}
