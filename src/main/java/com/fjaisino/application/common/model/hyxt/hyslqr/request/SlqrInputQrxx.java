package com.fjaisino.application.common.model.hyxt.hyslqr.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 17:21
 **/
@XmlRootElement(name = "qrxx")
@XmlAccessorType(XmlAccessType.FIELD)
public class SlqrInputQrxx {

    @XmlElement(name = "fpdm")
    private String fpdm;

    @XmlElement(name = "qshm")
    private String qshm;

    @XmlElement(name = "zzhm")
    private String zzhm;

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

    @Override
    public String toString() {
        return "SlqrInputQrxx{" +
                "fpdm='" + fpdm + '\'' +
                ", qshm='" + qshm + '\'' +
                ", zzhm='" + zzhm + '\'' +
                '}';
    }
}
