package com.fjaisino.application.common.model.fwsk.ztcx.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 16:06
 **/

@XmlRootElement(name = "INPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxInputInput {

    @XmlElement(name = "NSRSBH")
    private String nsrsbh;

    @XmlElement(name = "KPJH")
    private String kpjh;

    @XmlElement(name = "SBBH")
    private String sbbh;

    @XmlElement(name = "DCBB")
    private String dcbb;

    @XmlElement(name = "CXTJ")
    private ZtcxInputCxtj cxtj;

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

    public String getDcbb() {
        return dcbb;
    }

    public void setDcbb(String dcbb) {
        this.dcbb = dcbb;
    }

    public ZtcxInputCxtj getCxtj() {
        return cxtj;
    }

    public void setCxtj(ZtcxInputCxtj cxtj) {
        this.cxtj = cxtj;
    }

    @Override
    public String toString() {
        return "ZtcxInputInput{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", kpjh='" + kpjh + '\'' +
                ", sbbh='" + sbbh + '\'' +
                ", dcbb='" + dcbb + '\'' +
                ", cxtj=" + cxtj +
                '}';
    }
}
















