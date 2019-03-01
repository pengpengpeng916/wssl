package com.fjaisino.application.common.model.outmessage.outzzsfpxt.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-14 11:01
 **/
@XmlRootElement(name = "INPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class OuterOutputInput {
    @XmlElement(name = "DATA")
    private String data;

    @XmlElement(name = "CRC")
    private String crc;

    @XmlElement(name = "YSBZ")
    private String ysbz;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    public String getYsbz() {
        return ysbz;
    }

    public void setYsbz(String ysbz) {
        this.ysbz = ysbz;
    }

    @Override
    public String toString() {
        return "OuterOutputInput{" +
                "data='" + data + '\'' +
                ", crc='" + crc + '\'' +
                ", ysbz='" + ysbz + '\'' +
                '}';
    }
}
