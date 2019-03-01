package com.fjaisino.application.common.model.hyxt.hyztcx.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 21:18
 **/

@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxOutputBody {

    @XmlElement(name = "returnCode")
    private String returnCode;

    @XmlElement(name = "returnMessage")
    private String returnMessage;

    @XmlElement(name = "nsrsbh")
    private String nsrsbh;

    @XmlElement(name = "slxx")
    private ZtcxOutputtSlxx slxx;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public ZtcxOutputtSlxx getSlxx() {
        return slxx;
    }

    public void setSlxx(ZtcxOutputtSlxx slxx) {
        this.slxx = slxx;
    }

    @Override
    public String toString() {
        return "ZtcxOutputBody{" +
                "returnCode='" + returnCode + '\'' +
                ", returnMessage='" + returnMessage + '\'' +
                ", nsrsbh='" + nsrsbh + '\'' +
                ", slxx=" + slxx +
                '}';
    }
}
