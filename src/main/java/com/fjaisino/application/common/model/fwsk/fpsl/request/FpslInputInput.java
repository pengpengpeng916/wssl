package com.fjaisino.application.common.model.fwsk.fpsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 14:41
 **/

@XmlRootElement(name = "INPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslInputInput {

    @XmlElement(name = "NSRSBH")
    private String nsrsbh;

    @XmlElement(name = "KPJH")
    private String kpjh;

    @XmlElement(name = "SBBH")
    private String sbbh;

    @XmlElement(name = "DCBB")
    private String dcbb;

    @XmlElement(name = "FPSL")
    private FpslInputFpsl fpsl;

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

    public FpslInputFpsl getFpsl() {
        return fpsl;
    }

    public void setFpsl(FpslInputFpsl fpsl) {
        this.fpsl = fpsl;
    }

    @Override
    public String toString() {
        return "FpslInputInput{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", kpjh='" + kpjh + '\'' +
                ", sbbh='" + sbbh + '\'' +
                ", dcbb='" + dcbb + '\'' +
                ", fpsl=" + fpsl +
                '}';
    }
}

















