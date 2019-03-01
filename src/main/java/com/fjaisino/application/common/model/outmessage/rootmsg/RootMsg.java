package com.fjaisino.application.common.model.outmessage.rootmsg;

import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-21 17:32
 **/
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class RootMsg {
    @XmlAttribute()
    private String id;

    @XmlElement(name = "digitalEnvelope")
    private String digitalEnvelope;

    @XmlElement(name = "zip")
    private String zip;

    @XmlElement(name = "context")
    private String context;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDigitalEnvelope() {
        return digitalEnvelope;
    }

    public void setDigitalEnvelope(String digitalEnvelope) {
        this.digitalEnvelope = digitalEnvelope;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "RootMsg{" +
                "id='" + id + '\'' +
                ", digitalEnvelope='" + digitalEnvelope + '\'' +
                ", zip='" + zip + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
