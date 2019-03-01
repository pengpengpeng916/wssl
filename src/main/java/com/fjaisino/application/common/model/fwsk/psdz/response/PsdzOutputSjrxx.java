package com.fjaisino.application.common.model.fwsk.psdz.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2019-03-01 14:14
 **/
@XmlRootElement(name = "sjrxx")
@XmlAccessorType(XmlAccessType.FIELD)
public class PsdzOutputSjrxx {

    @XmlElement(name = "xm")
    private String xm;

    @XmlElement(name = "lxdh")
    private String lxdh;

    @XmlElement(name = "sfzhm")
    private String sfzhm;

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    @Override
    public String toString() {
        return "PsdzOutputSjrxx{" +
                "xm='" + xm + '\'' +
                ", lxdh='" + lxdh + '\'' +
                ", sfzhm='" + sfzhm + '\'' +
                '}';
    }
}
