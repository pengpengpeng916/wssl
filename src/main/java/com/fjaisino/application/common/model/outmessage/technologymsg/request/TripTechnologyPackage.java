package com.fjaisino.application.common.model.outmessage.technologymsg.request;

import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-13 20:16
 **/
@XmlRootElement(name = "tripTechnologyPackage")
@XmlAccessorType(XmlAccessType.FIELD)
public class TripTechnologyPackage {

    @XmlAttribute()
    private String version="1.0";

    @XmlElement(name = "identity")
    private Identity identity;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "TripTechnologyPackage{" +
                "version='" + version + '\'' +
                ", identity=" + identity +
                '}';
    }
}
