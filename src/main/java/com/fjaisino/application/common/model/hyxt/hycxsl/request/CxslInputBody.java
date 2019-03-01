package com.fjaisino.application.common.model.hyxt.hycxsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 17:47
 **/
@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CxslInputBody {

    @XmlElement(name = "nsrsbh")
    private String nsrsbh;

    @XmlElement(name = "slxh")
    private String slxh;

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

    @Override
    public String toString() {
        return "CxslInputBody{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", slxh='" + slxh + '\'' +
                '}';
    }
}
