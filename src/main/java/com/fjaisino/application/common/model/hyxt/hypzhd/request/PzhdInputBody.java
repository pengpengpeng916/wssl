package com.fjaisino.application.common.model.hyxt.hypzhd.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 16:49
 **/
@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdInputBody {

    @XmlElement(name = "nsrsbh")
    private String nsrsbh;

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    @Override
    public String toString() {
        return "PzhdOutputBody{" +
                "nsrsbh='" + nsrsbh + '\'' +
                '}';
    }
}
