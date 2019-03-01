package com.fjaisino.application.common.model.fwsk.zzqr.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 16:56
 **/

@XmlRootElement(name = "QRXX")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZzqrInputQrxx {

    @XmlElement(name = "FPDM")
    private String fpdm;

    @XmlElement(name = "QSHM")
    private String qshm;

    @XmlElement(name = "ZZHM")
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
        return "ZzqrInputQrxx{" +
                "fpdm='" + fpdm + '\'' +
                ", qshm='" + qshm + '\'' +
                ", zzhm='" + zzhm + '\'' +
                '}';
    }
}
