package com.fjaisino.application.common.model.fwsk.zzqr.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 16:56
 **/

@XmlRootElement(name = "INPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZzqrInputInput {

    @XmlElement(name = "NSRSBH")
    private String nsrsbh;

    @XmlElement(name = "SLXH")
    private String slxh;

    @XmlElement(name = "QRXX")
    private List<ZzqrInputQrxx> qrxxes;

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

    public List<ZzqrInputQrxx> getQrxxes() {
        return qrxxes;
    }

    public void setQrxxes(List<ZzqrInputQrxx> qrxxes) {
        this.qrxxes = qrxxes;
    }

    @Override
    public String toString() {
        return "ZzqrInputInput{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", slxh='" + slxh + '\'' +
                ", qrxxes=" + qrxxes +
                '}';
    }
}
