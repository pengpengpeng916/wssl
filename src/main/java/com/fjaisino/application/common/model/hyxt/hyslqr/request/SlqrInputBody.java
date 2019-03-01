package com.fjaisino.application.common.model.hyxt.hyslqr.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 17:21
 **/
@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class SlqrInputBody {

    @XmlElement(name = "nsrsbh")
    private String nsrsbh;

    @XmlElement(name = "slxh")
    private String slxh;

    @XmlElement(name = "qrxx")
    private List<SlqrInputQrxx> qrxxes;

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getSlxh() {
        return slxh;
    }

    public void setSlxh(String slxh) {
        this.slxh = slxh;
    }

    public List<SlqrInputQrxx> getQrxxes() {
        return qrxxes;
    }

    public void setQrxxes(List<SlqrInputQrxx> qrxxes) {
        this.qrxxes = qrxxes;
    }

    @Override
    public String toString() {
        return "SlqrInputBody{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", slxh='" + slxh + '\'' +
                ", qrxxes=" + qrxxes +
                '}';
    }
}
