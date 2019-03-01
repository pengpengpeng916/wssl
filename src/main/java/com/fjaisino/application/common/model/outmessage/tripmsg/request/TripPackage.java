package com.fjaisino.application.common.model.outmessage.tripmsg.request;

import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-13 21:06
 **/
@XmlRootElement(name = "tripPackage")
@XmlAccessorType(XmlAccessType.FIELD)
public class TripPackage {

    @XmlAttribute()
    private String version="1.0";

    @XmlAttribute()
    private String ssl="OA";

    @XmlElement(name = "technology")
    private String technology;

    @XmlElement(name = "businessContent")
    private String businessContent;

    @XmlElement(name = "signature")
    private SignaturePackege signature;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSsl() {
        return ssl;
    }

    public void setSsl(String ssl) {
        this.ssl = ssl;
    }

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

    public SignaturePackege getSignature() {
        return signature;
    }

    public void setSignature(SignaturePackege signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "TripPackage{" +
                "version='" + version + '\'' +
                ", ssl='" + ssl + '\'' +
                ", technology='" + technology + '\'' +
                ", businessContent='" + businessContent + '\'' +
                ", signature=" + signature +
                '}';
    }
}
