package com.fjaisino.application.common.model.outmessage.tripmsg.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-14 15:12
 **/
@XmlRootElement(name = "tripPackage")
@XmlAccessorType(XmlAccessType.FIELD)
public class OutputTripPackage {

    @XmlElement(name = "technology")
    private String technology;

    @XmlElement(name = "businessContent")
    private String businessContent;

    @XmlElement(name = "signature")
    private OutputSignature signature;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getBusinessContent() {
        return businessContent;
    }

    public void setBusinessContent(String businessContent) {
        this.businessContent = businessContent;
    }

    public OutputSignature getSignature() {
        return signature;
    }

    public void setSignature(OutputSignature signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "OutputTripPackage{" +
                "technology='" + technology + '\'' +
                ", businessContent='" + businessContent + '\'' +
                ", signature=" + signature +
                '}';
    }
}
